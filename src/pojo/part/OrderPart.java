package pojo.part;

import java.math.BigDecimal;

public class OrderPart {
	private String order_id;
	private int shop_account_id;
	private int order_status;
	private BigDecimal pay_total_price;
	private String create_time;
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public int getShop_account_id() {
		return shop_account_id;
	}
	public void setShop_account_id(int shop_account_id) {
		this.shop_account_id = shop_account_id;
	}
	public int getOrder_status() {
		return order_status;
	}
	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}
	public BigDecimal getPay_total_price() {
		return pay_total_price;
	}
	public void setPay_total_price(BigDecimal pay_total_price) {
		this.pay_total_price = pay_total_price;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
}
