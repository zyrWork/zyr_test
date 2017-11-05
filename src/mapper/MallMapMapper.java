package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.MallMap;
import pojo.MallMapExample;

public interface MallMapMapper {
    long countByExample(MallMapExample example);

    int deleteByExample(MallMapExample example);

    int deleteByPrimaryKey(Integer mallMapSerial);

    int insert(MallMap record);

    int insertSelective(MallMap record);

    List<MallMap> selectByExample(MallMapExample example);

    MallMap selectByPrimaryKey(Integer mallMapSerial);

    int updateByExampleSelective(@Param("record") MallMap record, @Param("example") MallMapExample example);

    int updateByExample(@Param("record") MallMap record, @Param("example") MallMapExample example);

    int updateByPrimaryKeySelective(MallMap record);

    int updateByPrimaryKey(MallMap record);
}