package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.ShopPic;
import pojo.ShopPicExample;

public interface ShopPicMapper {
    long countByExample(ShopPicExample example);

    int deleteByExample(ShopPicExample example);

    int deleteByPrimaryKey(Integer shopPicSerial);

    int insert(ShopPic record);

    int insertSelective(ShopPic record);

    List<ShopPic> selectByExample(ShopPicExample example);

    ShopPic selectByPrimaryKey(Integer shopPicSerial);

    int updateByExampleSelective(@Param("record") ShopPic record, @Param("example") ShopPicExample example);

    int updateByExample(@Param("record") ShopPic record, @Param("example") ShopPicExample example);

    int updateByPrimaryKeySelective(ShopPic record);

    int updateByPrimaryKey(ShopPic record);
}