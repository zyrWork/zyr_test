package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Points;
import pojo.PointsExample;

public interface PointsMapper {
    long countByExample(PointsExample example);

    int deleteByExample(PointsExample example);

    int deleteByPrimaryKey(Integer pointsSerial);

    int insert(Points record);

    int insertSelective(Points record);

    List<Points> selectByExample(PointsExample example);

    Points selectByPrimaryKey(Integer pointsSerial);

    int updateByExampleSelective(@Param("record") Points record, @Param("example") PointsExample example);

    int updateByExample(@Param("record") Points record, @Param("example") PointsExample example);

    int updateByPrimaryKeySelective(Points record);

    int updateByPrimaryKey(Points record);
}