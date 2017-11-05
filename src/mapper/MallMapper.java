package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Mall;
import pojo.MallExample;

public interface MallMapper {
    long countByExample(MallExample example);

    int deleteByExample(MallExample example);

    int deleteByPrimaryKey(Integer mallSerial);

    int insert(Mall record);

    int insertSelective(Mall record);

    List<Mall> selectByExampleWithBLOBs(MallExample example);

    List<Mall> selectByExample(MallExample example);

    Mall selectByPrimaryKey(Integer mallSerial);

    int updateByExampleSelective(@Param("record") Mall record, @Param("example") MallExample example);

    int updateByExampleWithBLOBs(@Param("record") Mall record, @Param("example") MallExample example);

    int updateByExample(@Param("record") Mall record, @Param("example") MallExample example);

    int updateByPrimaryKeySelective(Mall record);

    int updateByPrimaryKeyWithBLOBs(Mall record);

    int updateByPrimaryKey(Mall record);
}