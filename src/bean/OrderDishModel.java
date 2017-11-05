package bean;

import java.util.List;

/**
 * @author Swift
 *
 */
public class OrderDishModel {
	private List<OrderDish> order_dish;
	
	public List<OrderDish> getOrder_dish() {
		return order_dish;
	}

	public void setOrder_dish(List<OrderDish> order_dish) {
		this.order_dish = order_dish;
	}
	public OrderDishModel(){
		super();
	}
	
	
}
