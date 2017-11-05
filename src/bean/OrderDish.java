package bean;

/**
 * @author Swift
 *
 */
public class OrderDish {
	private int dish_id;
	private int dish_num;
	private String dish_name;
	private Double dish_price;
	private Double dish_pay_price;
	private String dish_pic;
	public String getDish_pic() {
		return dish_pic;
	}
	public void setDish_pic(String dish_pic) {
		this.dish_pic = dish_pic;
	}
	public int getDish_id() {
		return dish_id;
	}
	public void setDish_id(int dish_id) {
		this.dish_id = dish_id;
	}
	public int getDish_num() {
		return dish_num;
	}
	public void setDish_num(int dish_num) {
		this.dish_num = dish_num;
	}
	public String getDish_name() {
		return dish_name;
	}
	public void setDish_name(String dish_name) {
		this.dish_name = dish_name;
	}
	public Double getDish_price() {
		return dish_price;
	}
	public void setDish_price(Double dish_price) {
		this.dish_price = dish_price;
	}
	public Double getDish_pay_price() {
		return dish_pay_price;
	}
	public void setDish_pay_price(Double dish_pay_price) {
		this.dish_pay_price = dish_pay_price;
	}
}
