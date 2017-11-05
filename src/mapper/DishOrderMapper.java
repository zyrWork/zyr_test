package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.DishOrder;
import pojo.DishOrderExample;

public interface DishOrderMapper {
    long countByExample(DishOrderExample example);

    int deleteByExample(DishOrderExample example);

    int deleteByPrimaryKey(Integer dishTableSerial);

    int insert(DishOrder record);

    int insertSelective(DishOrder record);

    List<DishOrder> selectByExample(DishOrderExample example);

    DishOrder selectByPrimaryKey(Integer dishTableSerial);

    int updateByExampleSelective(@Param("record") DishOrder record, @Param("example") DishOrderExample example);

    int updateByExample(@Param("record") DishOrder record, @Param("example") DishOrderExample example);

    int updateByPrimaryKeySelective(DishOrder record);

    int updateByPrimaryKey(DishOrder record);
}