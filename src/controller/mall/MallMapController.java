package controller.mall;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import service.client.OrderOperator;
import service.mall.MallMapOperator;

/****
 * 
 * @author qinyao
 *
 */
@Controller
public class MallMapController {
	private Logger logger = Logger.getLogger(OrderOperator.class);
	@Autowired
	public MallMapOperator mallMapOperator;

	/***
	 * 新增商城地图
	 * 
	 * @param floorNo
	 *            楼层
	 * @param picUrl
	 *            地图图片url
	 */
	@RequestMapping(value = "/mallmap", method = { RequestMethod.POST })
	public @ResponseBody
	void addMallMap(
			@RequestParam(value = "floor_no", defaultValue = "-1") String floorNo,
			@RequestParam(value = "pic_url", defaultValue = "") String picUrl) {

		int rows = mallMapOperator.addMallMap(floorNo, picUrl);
		System.err.println(rows);
		logger.error("complete!");
	}
}
