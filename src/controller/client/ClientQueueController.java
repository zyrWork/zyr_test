package controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Swift
 *
 */
@Controller
public class ClientQueueController {
	@RequestMapping(value="/queue/{shop_account_id}")
	public @ResponseBody String add_queue_num(@RequestParam(value="customers_num")int customers_num,
																				@PathVariable int shop_account_id	){
		
		return "";
	}
}
