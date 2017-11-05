package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Shop;
import pojo.ShopExample;
import pojo.ShopWithBLOBs;

public interface ShopMapper {
    long countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    int deleteByPrimaryKey(Integer shopSerial);

    int insert(ShopWithBLOBs record);

    int insertSelective(ShopWithBLOBs record);

    List<ShopWithBLOBs> selectByExampleWithBLOBs(ShopExample example);

    List<Shop> selectByExample(ShopExample example);

    ShopWithBLOBs selectByPrimaryKey(Integer shopSerial);

    int updateByExampleSelective(@Param("record") ShopWithBLOBs record, @Param("example") ShopExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopWithBLOBs record, @Param("example") ShopExample example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByPrimaryKeySelective(ShopWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ShopWithBLOBs record);

    int updateByPrimaryKey(Shop record);
}