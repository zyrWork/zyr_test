package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Member;
import pojo.MemberExample;

public interface MemberMapper {
    long countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Integer memberSerial);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExampleWithBLOBs(MemberExample example);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(Integer memberSerial);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExampleWithBLOBs(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKeyWithBLOBs(Member record);

    int updateByPrimaryKey(Member record);
}