package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.PageViewLog;
import pojo.PageViewLogExample;

public interface PageViewLogMapper {
    long countByExample(PageViewLogExample example);

    int deleteByExample(PageViewLogExample example);

    int deleteByPrimaryKey(Integer pageSerial);

    int insert(PageViewLog record);

    int insertSelective(PageViewLog record);

    List<PageViewLog> selectByExample(PageViewLogExample example);

    PageViewLog selectByPrimaryKey(Integer pageSerial);

    int updateByExampleSelective(@Param("record") PageViewLog record, @Param("example") PageViewLogExample example);

    int updateByExample(@Param("record") PageViewLog record, @Param("example") PageViewLogExample example);

    int updateByPrimaryKeySelective(PageViewLog record);

    int updateByPrimaryKey(PageViewLog record);
}