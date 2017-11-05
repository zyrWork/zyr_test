package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.PointsChange;
import pojo.PointsChangeExample;

public interface PointsChangeMapper {
    long countByExample(PointsChangeExample example);

    int deleteByExample(PointsChangeExample example);

    int deleteByPrimaryKey(Integer pointsChangeSerial);

    int insert(PointsChange record);

    int insertSelective(PointsChange record);

    List<PointsChange> selectByExample(PointsChangeExample example);

    PointsChange selectByPrimaryKey(Integer pointsChangeSerial);

    int updateByExampleSelective(@Param("record") PointsChange record, @Param("example") PointsChangeExample example);

    int updateByExample(@Param("record") PointsChange record, @Param("example") PointsChangeExample example);

    int updateByPrimaryKeySelective(PointsChange record);

    int updateByPrimaryKey(PointsChange record);
}