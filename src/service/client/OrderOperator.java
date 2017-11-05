package service.client;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Random;

import mapper.OrderDetailMapper;
import mapper.OrdersMapper;
import mapper.ShopDiscountMapper;
import mapper.ShopMapper;
import mapper.part.OrderPartMapper;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pojo.OrderDetail;
import pojo.OrderDetailExample;
import pojo.Orders;
import pojo.OrdersExample;
import pojo.ShopDiscount;
import pojo.ShopDiscountExample;
import pojo.ShopExample;
import pojo.part.OrderPart;
import bean.OrderDish;
import controller.client.ClientOrderController;



/**
 * @author Swift
 *
 */

@Service
public class OrderOperator {
	private  Logger logger=Logger.getLogger(OrderOperator.class);
	@Autowired
	OrdersMapper order_mapper;
	@Autowired
	OrderDetailMapper order_detail_mapper;
	@Autowired
	ShopDiscountMapper shop_discount_mapper;
	@Autowired
	OrderPartMapper orderpart_mapper;
	

	
	public String get_now_time(){
		return   LocalDateTime.now().format( DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
	}
	

	public String new_random_order_id(){
		String now_time = LocalDateTime.now().format( DateTimeFormatter.ofPattern("yyMMddHHmmss"));
		String random= String.valueOf(new Random().nextInt(9000)+1000);
		String order_id=new StringBuilder().append(now_time).append(random).toString();
		return order_id;
	}
	
	public String new_order_id(){
		String order_id=this.new_random_order_id();
		OrdersExample order_example=new OrdersExample();
		order_example.or().andOrderIdEqualTo(order_id);
		long count=0;
		synchronized (this) {
			count=order_mapper.countByExample(order_example);
		}
		if(count>0){
			order_id= new_order_id();
		}
		logger.debug(order_id);
		return order_id;
	}
	
	@Transactional
	public double [] add_order_dish_list(List<OrderDish> dish_list,String order_id){
		OrderDetail order_detail=new OrderDetail();
		String now_time= "";
		double discount_dish_price=0.0;
		double dish_price=0.0;
		
		for(OrderDish dish:dish_list){
			now_time=this.get_now_time();
			order_detail.setCreateTime(now_time);
			order_detail.setLastModified(now_time);
			order_detail.setOrderId(order_id);
			order_detail.setDishId(dish.getDish_id());
			order_detail.setDishName(dish.getDish_name());
			order_detail.setDishPic(dish.getDish_pic());
			order_detail.setDishPayPrice(new BigDecimal(dish.getDish_pay_price()));
			order_detail.setDishPrice(new BigDecimal(dish.getDish_price()));
			order_detail.setIsDelete(false);
			order_detail.setDishNum(dish.getDish_num());
			
			discount_dish_price=discount_dish_price+dish.getDish_pay_price();
			dish_price=dish_price+dish.getDish_price();
			order_detail_mapper.insert(order_detail);
			
		}
		logger.debug("add_order_dish_list over");
		return new double [] {dish_price,discount_dish_price};
	}
	
	public double [] get_dish_list_price(List<OrderDish> dish_list){
		double discount_dish_price=0.0;
		double dish_price=0.0;
		
		for(OrderDish dish:dish_list){
			discount_dish_price=discount_dish_price+dish.getDish_pay_price();
			dish_price=dish_price+dish.getDish_price();	
		}
		return new double [] {dish_price,discount_dish_price};
	}

	
	
	/**
	 * @param member_account_id  会员id
	 * @param member_type 会员类型，用来计算店家折扣
	 * @param desk_number 桌号
	 * @param shop_account_id 店铺id
	 * @param order_dish_list 选菜的列表
	 * @param customers_number 一桌几人
	 * @return
	 */
	
	@Transactional
	public String add_new_order_info(int member_account_id,
			int member_type,
			short desk_number,
			int shop_account_id,
			List<OrderDish> order_dish_list,
			short customers_number){ 
		
		double [] price_array = get_dish_list_price(order_dish_list);	
		
		Orders order = new Orders();
		if(desk_number>0){
			order.setDeskNumber(desk_number);
		}
		
		String order_id= "";
		float shop_discount = (float) 1.00;
		double dish_discount_price =price_array[1];
		double dish_origin_price = price_array[0];
		double dish_total_price = 0.0;
				
		ShopDiscountExample example = new ShopDiscountExample();
		example.or().andShopAccountIdEqualTo(shop_account_id).andMemberTypeIdEqualTo(member_type);
		List<ShopDiscount> list_discount = shop_discount_mapper.selectByExample(example);
		shop_discount = list_discount.get(0).getDiscountPercent();
		dish_total_price = shop_discount * dish_discount_price;
		
		order.setMemberAccountId(member_account_id);
		order.setShopAccountId(shop_account_id);
		
		order.setCreateTime(get_now_time());
		order.setLastModified(get_now_time());
		
		order.setCustomersNumber(customers_number);
		
		order.setPayStatus((short)0);
		order.setOrderStatus((short)0);
		order.setDishOriginTotalPrice(BigDecimal.valueOf(dish_origin_price));
		order.setShopDiscount(shop_discount);
		order.setDishDiscountTotalPrice(BigDecimal.valueOf(dish_total_price));
		
		/**
		 * 考虑到order_id的唯一性，这里要保证多线程串行获取id，串行生成订单
		 */
		synchronized (this) {
			order_id=new_order_id();
			order.setOrderId(order_id);
			order_mapper.insert(order);
		}
		/**
		 * 添加order_detail表
		 */
		add_order_dish_list(order_dish_list, order_id);
		
		logger.debug("pay over");
		return order_id;
	}
	public List<OrderPart> select_order_list_by_account_id(int account_id,int start_no,int end_no){
		List<OrderPart> order_list = null;
		order_list =  orderpart_mapper.selectOrderListByAccountId(account_id,start_no,end_no);
		return order_list ;
	}
	
	public Orders select_order_by_id(String order_id){
		List <Orders> order= null ;
		OrdersExample example = new OrdersExample();
		example.or().andOrderIdEqualTo(order_id);
		order= order_mapper.selectByExample(example);
		if(order == null || order.size()==0){
			return null;
		}
		return order.get(0);
	}
	
	public List<OrderDetail> select_dish_by_id(String order_id){
		OrderDetailExample example = new OrderDetailExample();
		example .or().andOrderIdEqualTo(order_id).andIsDeleteEqualTo(false);
		return  order_detail_mapper.selectByExample(example);
		
		
	}
}
