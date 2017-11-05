package service.mall;

import mapper.MallMapMapper;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.MallMap;
import service.client.OrderOperator;
import util.MscgUtil;

/***
 * 
 * @author qinyao
 *
 */
@Service
public class MallMapOperator {

	private Logger logger = Logger.getLogger(OrderOperator.class);
	@Autowired
	MallMapMapper mallMapMapper;

	/***
	 * 新增商城地图
	 * 
	 * @param floorNo
	 *            楼层
	 * @param picUrl
	 *            地图图片url
	 */
	public int addMallMap(String floorNo, String picUrl) {
		// TODO 自动生成的方法存根
		MallMap record = new MallMap();
		String currentTime = MscgUtil.getCurrentTimeStr();
		record.setMapFloorNo(floorNo);
		record.setMapPic(picUrl);
		record.setCreateTime(currentTime);
		record.setLastModified(currentTime);
		int rows = mallMapMapper.insert(record);
		logger.error("insert a row");
		return rows;
	}

}
