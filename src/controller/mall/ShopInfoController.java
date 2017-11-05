package controller.mall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.ShopWithBLOBs;
import service.mall.ShopAccountOperator;
/**
 * 
 * @author jing
 *
 */

@Controller
@RequestMapping(value="/shop")
public class ShopInfoController {
	@Autowired
	public ShopAccountOperator shopAccountOperator;
	
	@RequestMapping(value="/account", method=RequestMethod.POST)
	@ResponseBody
	public int add_shop_account(@RequestParam("shop_name") String shop_name, 
			                       @RequestParam("shop_floor_no") String shop_floor_no,
			                       @RequestParam("shop_room_no") String shop_room_no,
			                       @RequestParam("shop_address") String shop_address){
		
		int shop_account_id = shopAccountOperator.gen_shop_account_id();
		
		ShopWithBLOBs shop=new ShopWithBLOBs();
		shop.setShopAccountId(shop_account_id);
		shop.setShopName(shop_name);
		shop.setShopFloorNo(shop_floor_no);
		shop.setShopRoomNo(shop_room_no);
		shop.setShopAddress(shop_address);
		
		return shop_account_id;
	}
}
