package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.ShopTableInfo;
import pojo.ShopTableInfoExample;

public interface ShopTableInfoMapper {
    long countByExample(ShopTableInfoExample example);

    int deleteByExample(ShopTableInfoExample example);

    int deleteByPrimaryKey(Integer seatTypeSerial);

    int insert(ShopTableInfo record);

    int insertSelective(ShopTableInfo record);

    List<ShopTableInfo> selectByExample(ShopTableInfoExample example);

    ShopTableInfo selectByPrimaryKey(Integer seatTypeSerial);

    int updateByExampleSelective(@Param("record") ShopTableInfo record, @Param("example") ShopTableInfoExample example);

    int updateByExample(@Param("record") ShopTableInfo record, @Param("example") ShopTableInfoExample example);

    int updateByPrimaryKeySelective(ShopTableInfo record);

    int updateByPrimaryKey(ShopTableInfo record);
}