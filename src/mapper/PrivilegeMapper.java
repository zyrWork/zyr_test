package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Privilege;
import pojo.PrivilegeExample;

public interface PrivilegeMapper {
    long countByExample(PrivilegeExample example);

    int deleteByExample(PrivilegeExample example);

    int deleteByPrimaryKey(Integer privSerial);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    List<Privilege> selectByExampleWithBLOBs(PrivilegeExample example);

    List<Privilege> selectByExample(PrivilegeExample example);

    Privilege selectByPrimaryKey(Integer privSerial);

    int updateByExampleSelective(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

    int updateByExampleWithBLOBs(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

    int updateByExample(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKeyWithBLOBs(Privilege record);

    int updateByPrimaryKey(Privilege record);
}