package bean;

/**
 * @author mcz
 *
 */
public class LoginBean {
	String identification_code,account_name,mall,phone;
	int account_id;
	public String getIdentification_code() {
		return identification_code;
	}
	public void setIdentification_code(String identification_code) {
		this.identification_code = identification_code;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getMall() {
		return mall;
	}
	public void setMall(String mall) {
		this.mall = mall;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	
}
