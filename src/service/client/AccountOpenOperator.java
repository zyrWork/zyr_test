package service.client;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.Account;
import pojo.AccountExample;
import pojo.AccountExample.Criteria;
import mapper.AccountMapper;

@Service
public class AccountOpenOperator {
	@Autowired
	private AccountMapper accountMapper;

	private AccountExample accountExample = new AccountExample();

	// 通过id查询账户信息
	@Transactional
	public Account selectAccountById(Integer accountID) {
		return accountMapper.selectByPrimaryKey(accountID);
	}

	// 关闭或启用账户
	@Transactional
	public int  closeOrOpenAccount(int account_id,Boolean is_enabled){
		//相当于update account set is_enabled='is_enabled' where account_id='account_id'
		 Criteria criteria = accountExample.createCriteria();
		 criteria.andAccountIdEqualTo(account_id);
		 
         Account account=new Account();
         account.setIsEnabled(is_enabled);
         //updateByExampleSelective更新account中值不为空的字段，
         //updateByExample用account中所有的字段来更新数据库，不能用updateByExample
         return accountMapper.updateByExampleSelective(account, accountExample);
	}
}
