package controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.Account;
import service.client.LoginOperator;
import service.client.IdentifyOperator;

import bean.LoginBean;

/*
 * 负责注册的相关操作
 * 具体流程：
 * 服务器接收到用户的注册请求，需要：用户名（account_id）、密码(password)、验证码三项
 * 验证验证码正确性
 * 若验证码出错，返回错误提示
 * 否则，服务器检索数据库，查询用户名(account_id)是否重复
 * 若重复，则返回错误提示
 * 否则，新建一条account表的记录
 * 
 * input：
 * account_id,identification_code,account_name,mall,phone
 * 注：当用户未输入mall和phone的时候，应当保留这两个字段，值为空
 * return:
 * err_msg

 * @author mcz
 *
 */
@Controller
public class registercontroler {
	
	@Autowired
	public LoginOperator loginOperator;
	public IdentifyOperator identifyOperator;
	@RequestMapping(value="/register.action" ,method=RequestMethod.POST)
	public  @ResponseBody String new_account_info(@RequestParam(value="account_id")int account_id,
			@RequestParam(value="account_name")String account_name,
			@RequestParam(value="identification_code")String identification_code,
			@RequestParam(value="mall")String mall,
			@RequestParam(value="phone")String phone) {
		// TODO Auto-generated method stub
		
		String err_msg="success";
		/*
		 * 确定验证码是否正确无误
		 * */
		if(identifyOperator.queryVerifyMsg()==identifyOperator.faliure){
			err_msg="identify failure!";
			return err_msg;
		}
		/*
		 * 查询用户id是否已经存在
		 * */
		if(!loginOperator.ishave_account_info_by_id(account_id)){
			err_msg="account_id already exsists!";
			return err_msg;
		}
		Account account=new Account();
		account.setAccountId(account_id);
		account.setAccountType((short) 1);
		account.setNickname(account_name);
		account.setPhone(phone);
		account.setSalt("asd");
		account.setIsEnabled(true);
		account.setIsDelete(false);
		try{
			loginOperator.new_account_info(account);
		}catch (Exception e){
			err_msg="insert failure!";
			return err_msg;
		}
		LoginBean loginbean=new LoginBean();
		loginbean.setAccount_id(account_id);
		loginbean.setAccount_name(account_name);
		loginbean.setIdentification_code(identification_code);
		return err_msg;
	}
}
