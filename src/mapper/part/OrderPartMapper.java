package mapper.part;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.part.OrderPart;

public interface OrderPartMapper {
	List<OrderPart> selectOrderListByAccountId(@Param("member_account_id")int member_account_id,@Param("start_no")int start_no,@Param("end_no")int end_no);
}
