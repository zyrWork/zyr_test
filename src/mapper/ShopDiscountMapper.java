package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.ShopDiscount;
import pojo.ShopDiscountExample;

public interface ShopDiscountMapper {
    long countByExample(ShopDiscountExample example);

    int deleteByExample(ShopDiscountExample example);

    int deleteByPrimaryKey(Integer shopDiscountSerial);

    int insert(ShopDiscount record);

    int insertSelective(ShopDiscount record);

    List<ShopDiscount> selectByExample(ShopDiscountExample example);

    ShopDiscount selectByPrimaryKey(Integer shopDiscountSerial);

    int updateByExampleSelective(@Param("record") ShopDiscount record, @Param("example") ShopDiscountExample example);

    int updateByExample(@Param("record") ShopDiscount record, @Param("example") ShopDiscountExample example);

    int updateByPrimaryKeySelective(ShopDiscount record);

    int updateByPrimaryKey(ShopDiscount record);
}