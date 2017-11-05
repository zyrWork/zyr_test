package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.DishSaleStatistics;
import pojo.DishSaleStatisticsExample;

public interface DishSaleStatisticsMapper {
    long countByExample(DishSaleStatisticsExample example);

    int deleteByExample(DishSaleStatisticsExample example);

    int deleteByPrimaryKey(Integer dishSaleStatisticsSerial);

    int insert(DishSaleStatistics record);

    int insertSelective(DishSaleStatistics record);

    List<DishSaleStatistics> selectByExample(DishSaleStatisticsExample example);

    DishSaleStatistics selectByPrimaryKey(Integer dishSaleStatisticsSerial);

    int updateByExampleSelective(@Param("record") DishSaleStatistics record, @Param("example") DishSaleStatisticsExample example);

    int updateByExample(@Param("record") DishSaleStatistics record, @Param("example") DishSaleStatisticsExample example);

    int updateByPrimaryKeySelective(DishSaleStatistics record);

    int updateByPrimaryKey(DishSaleStatistics record);
}