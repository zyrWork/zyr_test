package service.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bean.MemberDetailInfoBean;
import pojo.Account;
import pojo.AccountExample;
import pojo.Member;
import pojo.MemberExample;
import mapper.AccountMapper;
import mapper.MemberMapper;

@Service
public class MemberOperator {
	@Autowired
	private MemberMapper memberMapper;

	private MemberExample memberExample = new MemberExample();

	//查询单一的用户信息并返回
	@Transactional
	public Member selectMemberById(Integer memberID) {
		return memberMapper.selectByPrimaryKey(memberID);
	}

	//查询所有的用户信息并返回
	@Transactional
	public List<Member> selectAllMembers() {
		// 自定义查询条件可能返回多条记录,使用List接收
		memberExample.setOrderByClause("member_serial asc"); // asc升序,desc降序排列
		// memberExample.setDistinct(false); //去除重复
		// 通过criteria构造查询条件
		// MemberExample.Criteria criteria = memberExample.createCriteria();
		// //构造自定义查询条件
		// criteria.andMemberSerialEqualTo(1);
		return  memberMapper.selectByExample(memberExample);
	}
}
