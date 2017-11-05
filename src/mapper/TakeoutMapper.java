package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Takeout;
import pojo.TakeoutExample;

public interface TakeoutMapper {
    long countByExample(TakeoutExample example);

    int deleteByExample(TakeoutExample example);

    int deleteByPrimaryKey(Integer takeoutSerial);

    int insert(Takeout record);

    int insertSelective(Takeout record);

    List<Takeout> selectByExampleWithBLOBs(TakeoutExample example);

    List<Takeout> selectByExample(TakeoutExample example);

    Takeout selectByPrimaryKey(Integer takeoutSerial);

    int updateByExampleSelective(@Param("record") Takeout record, @Param("example") TakeoutExample example);

    int updateByExampleWithBLOBs(@Param("record") Takeout record, @Param("example") TakeoutExample example);

    int updateByExample(@Param("record") Takeout record, @Param("example") TakeoutExample example);

    int updateByPrimaryKeySelective(Takeout record);

    int updateByPrimaryKeyWithBLOBs(Takeout record);

    int updateByPrimaryKey(Takeout record);
}