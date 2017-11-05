package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.ParkingInfo;
import pojo.ParkingInfoExample;

public interface ParkingInfoMapper {
    long countByExample(ParkingInfoExample example);

    int deleteByExample(ParkingInfoExample example);

    int deleteByPrimaryKey(Integer parkingSerial);

    int insert(ParkingInfo record);

    int insertSelective(ParkingInfo record);

    List<ParkingInfo> selectByExample(ParkingInfoExample example);

    ParkingInfo selectByPrimaryKey(Integer parkingSerial);

    int updateByExampleSelective(@Param("record") ParkingInfo record, @Param("example") ParkingInfoExample example);

    int updateByExample(@Param("record") ParkingInfo record, @Param("example") ParkingInfoExample example);

    int updateByPrimaryKeySelective(ParkingInfo record);

    int updateByPrimaryKey(ParkingInfo record);
}