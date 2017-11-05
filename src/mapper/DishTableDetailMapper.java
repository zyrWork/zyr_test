package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.DishTableDetail;
import pojo.DishTableDetailExample;

public interface DishTableDetailMapper {
    long countByExample(DishTableDetailExample example);

    int deleteByExample(DishTableDetailExample example);

    int deleteByPrimaryKey(Integer dishTableDetailSerial);

    int insert(DishTableDetail record);

    int insertSelective(DishTableDetail record);

    List<DishTableDetail> selectByExample(DishTableDetailExample example);

    DishTableDetail selectByPrimaryKey(Integer dishTableDetailSerial);

    int updateByExampleSelective(@Param("record") DishTableDetail record, @Param("example") DishTableDetailExample example);

    int updateByExample(@Param("record") DishTableDetail record, @Param("example") DishTableDetailExample example);

    int updateByPrimaryKeySelective(DishTableDetail record);

    int updateByPrimaryKey(DishTableDetail record);
}