package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.PointRule;
import pojo.PointRuleExample;

public interface PointRuleMapper {
    long countByExample(PointRuleExample example);

    int deleteByExample(PointRuleExample example);

    int deleteByPrimaryKey(Integer ruleSerial);

    int insert(PointRule record);

    int insertSelective(PointRule record);

    List<PointRule> selectByExample(PointRuleExample example);

    PointRule selectByPrimaryKey(Integer ruleSerial);

    int updateByExampleSelective(@Param("record") PointRule record, @Param("example") PointRuleExample example);

    int updateByExample(@Param("record") PointRule record, @Param("example") PointRuleExample example);

    int updateByPrimaryKeySelective(PointRule record);

    int updateByPrimaryKey(PointRule record);
}