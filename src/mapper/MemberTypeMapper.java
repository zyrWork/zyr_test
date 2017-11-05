package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.MemberType;
import pojo.MemberTypeExample;

public interface MemberTypeMapper {
    long countByExample(MemberTypeExample example);

    int deleteByExample(MemberTypeExample example);

    int deleteByPrimaryKey(Integer memberTypeSerial);

    int insert(MemberType record);

    int insertSelective(MemberType record);

    List<MemberType> selectByExample(MemberTypeExample example);

    MemberType selectByPrimaryKey(Integer memberTypeSerial);

    int updateByExampleSelective(@Param("record") MemberType record, @Param("example") MemberTypeExample example);

    int updateByExample(@Param("record") MemberType record, @Param("example") MemberTypeExample example);

    int updateByPrimaryKeySelective(MemberType record);

    int updateByPrimaryKey(MemberType record);
}