package controller.mall;

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
import pojo.Account;
import pojo.Member;
import pojo.MemberType;
import service.client.AccountOpenOperator;
import service.client.MemberOperator;
import service.client.MemberTypeOperator;

@Controller
@RequestMapping("/v1")
public class MemberMall {
	@Autowired
	public MemberOperator memberOperator;
	@Autowired
	public AccountOpenOperator accountOpenOperator;
	@Autowired
	public MemberTypeOperator memberTypeOperator;
	
	/**
	 * @param member_id
	 * @return
	 * 请求格式：http://localhost:8080/181mall/v1/member/1
	 */
	@RequestMapping(value="/member/{member_id}" ,method=RequestMethod.GET)
	public  @ResponseBody MemberDetailInfoBean getMemberDetailInfoById(@PathVariable("member_id")int member_id) {
		return getOneMemberDetailInfo(member_id);
	}
	/**
	 * @param keyword
	 * @param page_size
	 * @param page_no
	 * @param c
	 * @return
	 * 请求格式： http://localhost:8080/181mall/v1/member.action?keyword=12&page_size=10&page_no=1&c=12
	 */
	@RequestMapping(value="/member" ,method=RequestMethod.GET)
	public  @ResponseBody List<MemberDetailInfoBean> getAllMemberDetailInfo(@RequestParam(value="keyword") String keyword,
			                                                    @RequestParam(value="page_size")int page_size,
			                                                    @RequestParam(value="page_no")int page_no,
			                                                    @RequestParam(value="c")int c) {

		List<Member> members = new ArrayList<Member>();
		List<MemberDetailInfoBean> memberDetailInfoBeans = new ArrayList<MemberDetailInfoBean>();
	    members=memberOperator.selectAllMembers();

		for(int i=0;i<members.size();i++)
		{
			memberDetailInfoBeans.add(getOneMemberDetailInfo(members.get(i).getMemberSerial().intValue()));
		}
		//计算会员的页数
		int memberPageNumber=(memberDetailInfoBeans.size()%page_size==0)?(memberDetailInfoBeans.size()/page_size):(memberDetailInfoBeans.size()/page_size+1);
		int lastPageNumber=(memberDetailInfoBeans.size()%page_size==0)?(page_size):(memberDetailInfoBeans.size()%page_size);
		//比较请求的页面是否超出限制
		if(page_no>memberPageNumber)
		{//超出限制，请求内容不存在
			return null;
		}
		//根据请求页面返回相应内容，页面编号默认从1开始
		int startNumber=(page_no-1)*page_size;
		int endNumber=page_no*page_size;//默认为满页
		if(page_no==memberPageNumber)
		{//如果是最后一页
			endNumber=startNumber+lastPageNumber;
		}
		List<MemberDetailInfoBean> memberDetailInfoBeanPage = new ArrayList<MemberDetailInfoBean>();
		for(int i=startNumber;i<endNumber;i++)
		{
			memberDetailInfoBeanPage.add(memberDetailInfoBeans.get(i));
		}
		return memberDetailInfoBeanPage;
	}
	/**
	 * @param member_id
	 * @return
	 * 根据member_id返回一个MemberInfoBean包装类的对象
	 */
	private MemberDetailInfoBean getOneMemberDetailInfo(int member_id)
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
        //通过Member中的memberTypeId来查询MemberType表得到相应内容
		MemberType memberType=new MemberType();
		memberType=memberTypeOperator.selectMemberTypeById(member.getMemberTypeId());

		//将查询得到的内容放到包装类中，返回给用户
		MemberDetailInfoBean memberDetailInfoBean=new MemberDetailInfoBean();
		
		memberDetailInfoBean.setPhone(account.getPhone());
		memberDetailInfoBean.setIsEnabled(account.getIsEnabled());
	
		memberDetailInfoBean.setMemberSerial(member.getMemberSerial());
		memberDetailInfoBean.setMemberQq(member.getMemberQq());
		memberDetailInfoBean.setMemberMail(member.getMemberMail());
		memberDetailInfoBean.setMemberAddress(member.getMemberAddress());
		
		memberDetailInfoBean.setTypeName(memberType.getTypeName());
		return memberDetailInfoBean;
	}

}
