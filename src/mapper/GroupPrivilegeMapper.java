package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.GroupPrivilege;
import pojo.GroupPrivilegeExample;

public interface GroupPrivilegeMapper {
    long countByExample(GroupPrivilegeExample example);

    int deleteByExample(GroupPrivilegeExample example);

    int deleteByPrimaryKey(Integer groupPrivSerial);

    int insert(GroupPrivilege record);

    int insertSelective(GroupPrivilege record);

    List<GroupPrivilege> selectByExample(GroupPrivilegeExample example);

    GroupPrivilege selectByPrimaryKey(Integer groupPrivSerial);

    int updateByExampleSelective(@Param("record") GroupPrivilege record, @Param("example") GroupPrivilegeExample example);

    int updateByExample(@Param("record") GroupPrivilege record, @Param("example") GroupPrivilegeExample example);

    int updateByPrimaryKeySelective(GroupPrivilege record);

    int updateByPrimaryKey(GroupPrivilege record);
}