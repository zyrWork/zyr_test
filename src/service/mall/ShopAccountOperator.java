package service.mall;

import mapper.ShopMapper;

import org.springframework.beans.factory.annotation.Autowired;

import pojo.ShopExample;


/**
 * 对商家账户进行操作的service层
 * @author jing
 * 2017/11/3
 */

public class ShopAccountOperator {
	@Autowired
	private ShopMapper shop_mapper;
	
//	生成商家id
	public int gen_shop_account_id(){
		ShopExample example = new ShopExample();
		long account_num = shop_mapper.countByExample(example);
		if(account_num==0){
//			表为空时则从1000开始计数
			return 1000;
		}
		else{
			//参数还未填入
			int latest_shop_account_id=search_latest_shop_account_id();
			return latest_shop_account_id+1;
		}
	}
	
//	查找商家表信息表最新一条记录的商家id
	public int search_latest_shop_account_id(){
		
	}
}
