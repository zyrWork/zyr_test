package controller.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bean.MemberDetailInfoBean;
import bean.MemberInfoBean;
import pojo.Account;
import pojo.Member;
import pojo.MemberType;
import service.client.AccountOpenOperator;
import service.client.MemberOperator;
import service.client.MemberTypeOperator;

@Controller
@RequestMapping("/v1")
public class MemberClient {
	@Autowired
	public MemberOperator memberOperator;
	@Autowired
	public AccountOpenOperator accountOpenOperator;

	/**
	 * @param member_id
	 * @return MemberInfoBean
	 * 请求格式：http://localhost:8080/181mall/v1/member/info/1
	 */
	@RequestMapping(value="/member/info/{member_id}" ,method=RequestMethod.GET)
	public  @ResponseBody MemberInfoBean getMemberInfoById(@PathVariable("member_id")int member_id) {
		return getOneMemberInfo(member_id);
	}

	/**
	 * 根据member_id返回一个MemberInfoBean包装类的对象
	 * @param member_id
	 * @return MemberInfoBean
	 */
	private MemberInfoBean getOneMemberInfo(int member_id)
	{
		Member member=new Member();
		//根据客户端的member_id，从数据库中查询Member表并返回
		member=memberOperator.selectMemberById(member_id);
		if(member==null)
		{
			return null;
		}
      //通过Member中的memberAccountId查询Account表，获得相应字段
		Account account=new Account();
		account=accountOpenOperator.selectAccountById(member.getMemberAccountId());

		//将查询得到的内容放到包装类中，返回给用户
		MemberInfoBean memberInfoBean=new MemberInfoBean();
		
		memberInfoBean.setPhone(account.getPhone());
		
		memberInfoBean.setMemberNo(member.getMemberNo());
		memberInfoBean.setMemberQq(member.getMemberQq());
		memberInfoBean.setMemberMail(member.getMemberMail());
		memberInfoBean.setMemberAddress(member.getMemberAddress());
		
		return memberInfoBean;
	}
	@RequestMapping(value="/member/score/{member_id}" ,method=RequestMethod.GET)
	public  @ResponseBody MemberInfoBean getMemberPoint(@PathVariable("member_id")int member_id) {
		return getOneMemberInfo(member_id);
	}
}
