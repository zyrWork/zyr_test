package bean;

import java.util.List;

import pojo.OrderDetail;
import pojo.Orders;

/**
 * @author Swift
 *
 */
public class DetailedOrder  {
	Orders order ;
	List<OrderDetail> order_detail_list;
	public List<OrderDetail> getOrder_detail_list() {
		return order_detail_list;
	}

	public void setOrder_detail_list(List<OrderDetail> order_detail_list) {
		this.order_detail_list = order_detail_list;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
}
