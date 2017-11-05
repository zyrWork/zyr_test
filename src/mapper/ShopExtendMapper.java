package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.ShopExtend;
import pojo.ShopExtendExample;

public interface ShopExtendMapper {
    long countByExample(ShopExtendExample example);

    int deleteByExample(ShopExtendExample example);

    int deleteByPrimaryKey(Integer extendSerial);

    int insert(ShopExtend record);

    int insertSelective(ShopExtend record);

    List<ShopExtend> selectByExample(ShopExtendExample example);

    ShopExtend selectByPrimaryKey(Integer extendSerial);

    int updateByExampleSelective(@Param("record") ShopExtend record, @Param("example") ShopExtendExample example);

    int updateByExample(@Param("record") ShopExtend record, @Param("example") ShopExtendExample example);

    int updateByPrimaryKeySelective(ShopExtend record);

    int updateByPrimaryKey(ShopExtend record);
}