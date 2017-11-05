package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Dish;
import pojo.DishExample;

public interface DishMapper {
    long countByExample(DishExample example);

    int deleteByExample(DishExample example);

    int deleteByPrimaryKey(Integer dishSerial);

    int insert(Dish record);

    int insertSelective(Dish record);

    List<Dish> selectByExampleWithBLOBs(DishExample example);

    List<Dish> selectByExample(DishExample example);

    Dish selectByPrimaryKey(Integer dishSerial);

    int updateByExampleSelective(@Param("record") Dish record, @Param("example") DishExample example);

    int updateByExampleWithBLOBs(@Param("record") Dish record, @Param("example") DishExample example);

    int updateByExample(@Param("record") Dish record, @Param("example") DishExample example);

    int updateByPrimaryKeySelective(Dish record);

    int updateByPrimaryKeyWithBLOBs(Dish record);

    int updateByPrimaryKey(Dish record);
}