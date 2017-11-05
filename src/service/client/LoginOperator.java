package service.client;

import mapper.AccountMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pojo.Account;
import pojo.AccountExample;

/*
 * author：mcz
 * 针对用户数据的操作，主要负责新建用户数据、根据用户ID获取用户数据
 * */
/**
 * @author mcz
 *
 */
@Service
public class LoginOperator {
	@Autowired
	private AccountMapper account_mapper;
	
	private AccountExample example =new AccountExample();
	
	@Transactional
	public int new_account_info(Account account){
		return account_mapper.insert(account);
	}
	
	@Transactional
	public int delete_account_by_id(int id){
		 example.or().andAccountIdEqualTo(id);
		return account_mapper.deleteByExample(example);	
	}
	
	@Transactional
	public boolean ishave_account_info_by_id(int id){
		if(example.or().andAccountIdEqualTo(id)==null){
			return false;
		}
		return true;
	}
}
