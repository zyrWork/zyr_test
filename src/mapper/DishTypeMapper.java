package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.DishType;
import pojo.DishTypeExample;

public interface DishTypeMapper {
    long countByExample(DishTypeExample example);

    int deleteByExample(DishTypeExample example);

    int deleteByPrimaryKey(Integer dishTypeSerial);

    int insert(DishType record);

    int insertSelective(DishType record);

    List<DishType> selectByExample(DishTypeExample example);

    DishType selectByPrimaryKey(Integer dishTypeSerial);

    int updateByExampleSelective(@Param("record") DishType record, @Param("example") DishTypeExample example);

    int updateByExample(@Param("record") DishType record, @Param("example") DishTypeExample example);

    int updateByPrimaryKeySelective(DishType record);

    int updateByPrimaryKey(DishType record);
}