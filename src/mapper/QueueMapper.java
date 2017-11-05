package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Queue;
import pojo.QueueExample;

public interface QueueMapper {
    long countByExample(QueueExample example);

    int deleteByExample(QueueExample example);

    int deleteByPrimaryKey(Integer queueSerial);

    int insert(Queue record);

    int insertSelective(Queue record);

    List<Queue> selectByExample(QueueExample example);

    Queue selectByPrimaryKey(Integer queueSerial);

    int updateByExampleSelective(@Param("record") Queue record, @Param("example") QueueExample example);

    int updateByExample(@Param("record") Queue record, @Param("example") QueueExample example);

    int updateByPrimaryKeySelective(Queue record);

    int updateByPrimaryKey(Queue record);
}