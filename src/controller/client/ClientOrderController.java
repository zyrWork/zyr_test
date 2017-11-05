package controller.client;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.OrderDetail;
import pojo.Orders;
import pojo.part.OrderPart;
import service.client.OrderOperator;
import bean.DetailedOrder;
import bean.OrderDish;
import bean.OrderDishModel;

/**
 * @author Swift
 * 
 */
@Controller
public class ClientOrderController {
	private  Logger logger=Logger.getLogger(ClientOrderController.class);
	@Autowired
	public OrderOperator order_operator;
	
	/**
	 * 处理添加新订单的请求，生成状态为 未支付 的订单，将菜单添加到订单详情中，并将订单id返回
	 * 
	 * @param desk_number 桌号，可能为空，默认为-1，表示不使用桌号
	 * @param shop_account_id 店家id
	 * @param order_dish_model 接收菜单列表
	 * @param customers_number 顾客数量，可能为空，默认为1
	 * @return order_id 返回订单id
	 * 
	 */
	
	@RequestMapping(value="/order/{shop_account_id}",method={RequestMethod.POST})
	public @ResponseBody String new_order(@RequestParam(value="desk_number",defaultValue="-1") short desk_number,
																	@RequestParam(value="customers_number",defaultValue="1") short customers_number,
																	@PathVariable int shop_account_id,
																	 OrderDishModel order_dish_model){
		String order_id=" ";
		int member_type=1;
		int account_id=711031234;
		List<OrderDish> order_dish_list=order_dish_model.getOrder_dish();
		
		if(order_dish_list==null){
			return order_id;
		}
		order_id=order_operator.add_new_order_info(
					 account_id,
					 member_type,
					 desk_number,
					 shop_account_id,
					 order_dish_list,
					 customers_number);
		logger.debug("new_order over");
		return order_id;	
	}
	
	
	/**
	 * 用户查看自己的订单
	 * @param page_size  页面大小
	 * @param page_no 页号
	 * @return 返回订单列表
	 */
	@RequestMapping(value="/order/list",method={RequestMethod.GET})
	public @ResponseBody List<OrderPart> select_order_list(@RequestParam(value="page_size",defaultValue="10") int page_size,
			@RequestParam(value="page_no",defaultValue="1") int page_no){
		int account_id =711031234;
		if(page_size<=0){ 
			page_size = 10;
		}
		if(page_no<1){
			page_no =1;
		}
		
		int start_no=page_size*(page_no-1);
		int end_no = start_no+page_size;
		return order_operator.select_order_list_by_account_id(account_id,start_no,end_no);
	}
	/**根据order_id 查询order信息
	 * @param order_id
	 * @return 返回的对象包括两部分，一部分是订单主表的信息，另一部分是订单的菜单信息
	 */
	@RequestMapping(value="/order/{order_id}" , method={RequestMethod.GET})
	public @ResponseBody DetailedOrder select_order_info(@PathVariable(value="order_id") String order_id){
		Orders order= order_operator.select_order_by_id(order_id);
		List<OrderDetail> order_detail_list = order_operator.select_dish_by_id(order_id);
		DetailedOrder detailed_order =new DetailedOrder();
		detailed_order.setOrder(order);
		detailed_order.setOrder_detail_list(order_detail_list);
		return detailed_order;
	}
	
}
