package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.LoginLog;
import pojo.LoginLogExample;

public interface LoginLogMapper {
    long countByExample(LoginLogExample example);

    int deleteByExample(LoginLogExample example);

    int deleteByPrimaryKey(Integer loginSerial);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);

    List<LoginLog> selectByExampleWithBLOBs(LoginLogExample example);

    List<LoginLog> selectByExample(LoginLogExample example);

    LoginLog selectByPrimaryKey(Integer loginSerial);

    int updateByExampleSelective(@Param("record") LoginLog record, @Param("example") LoginLogExample example);

    int updateByExampleWithBLOBs(@Param("record") LoginLog record, @Param("example") LoginLogExample example);

    int updateByExample(@Param("record") LoginLog record, @Param("example") LoginLogExample example);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKeyWithBLOBs(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}