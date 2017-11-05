package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.WaitingTimeStatistics;
import pojo.WaitingTimeStatisticsExample;

public interface WaitingTimeStatisticsMapper {
    long countByExample(WaitingTimeStatisticsExample example);

    int deleteByExample(WaitingTimeStatisticsExample example);

    int deleteByPrimaryKey(Integer waitingTimeStatisticsSerial);

    int insert(WaitingTimeStatistics record);

    int insertSelective(WaitingTimeStatistics record);

    List<WaitingTimeStatistics> selectByExample(WaitingTimeStatisticsExample example);

    WaitingTimeStatistics selectByPrimaryKey(Integer waitingTimeStatisticsSerial);

    int updateByExampleSelective(@Param("record") WaitingTimeStatistics record, @Param("example") WaitingTimeStatisticsExample example);

    int updateByExample(@Param("record") WaitingTimeStatistics record, @Param("example") WaitingTimeStatisticsExample example);

    int updateByPrimaryKeySelective(WaitingTimeStatistics record);

    int updateByPrimaryKey(WaitingTimeStatistics record);
}