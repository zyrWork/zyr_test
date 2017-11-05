package service.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pojo.Account;
import pojo.AccountExample;
import pojo.Member;
import pojo.MemberExample;
import pojo.MemberType;
import pojo.MemberTypeExample;
import mapper.AccountMapper;
import mapper.MemberMapper;
import mapper.MemberTypeMapper;

@Service
public class MemberTypeOperator {
	@Autowired
	private MemberTypeMapper memberTypeMapper;
	
	//private MemberTypeExample memberTypeExample =new MemberTypeExample();
	
	@Transactional
	public MemberType selectMemberTypeById(Integer memberTypeID){
		return memberTypeMapper.selectByPrimaryKey(memberTypeID);
	}
	
}
