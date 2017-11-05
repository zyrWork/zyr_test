package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.ParkMap;
import pojo.ParkMapExample;

public interface ParkMapMapper {
    long countByExample(ParkMapExample example);

    int deleteByExample(ParkMapExample example);

    int deleteByPrimaryKey(Integer parkMapSerial);

    int insert(ParkMap record);

    int insertSelective(ParkMap record);

    List<ParkMap> selectByExample(ParkMapExample example);

    ParkMap selectByPrimaryKey(Integer parkMapSerial);

    int updateByExampleSelective(@Param("record") ParkMap record, @Param("example") ParkMapExample example);

    int updateByExample(@Param("record") ParkMap record, @Param("example") ParkMapExample example);

    int updateByPrimaryKeySelective(ParkMap record);

    int updateByPrimaryKey(ParkMap record);
}