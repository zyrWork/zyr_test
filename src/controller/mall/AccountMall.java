package controller.mall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import service.client.AccountOpenOperator;


//管理会员或者商家的账户信息
@Controller
@RequestMapping("/v1")
public class AccountMall {
	@Autowired
	public AccountOpenOperator accountOpenOperator;

	/**
	 * @param account_id
	 * @param is_enabled
	 * 请求格式：http://localhost:8080/181mall/v1/account/2/0
	 */
	@RequestMapping(value = "/account/{account_id}/{is_enabled}", method = RequestMethod.GET)
	public  @ResponseBody void  closeOrOpenAccountById(@PathVariable("account_id") int account_id,@PathVariable("is_enabled") int is_enabled) {
		Boolean is_enable;
		is_enable=(is_enabled==0)?false:true; 
		accountOpenOperator.closeOrOpenAccount(account_id,is_enable);
	}
}
