package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.ShopSaleStatistics;
import pojo.ShopSaleStatisticsExample;

public interface ShopSaleStatisticsMapper {
    long countByExample(ShopSaleStatisticsExample example);

    int deleteByExample(ShopSaleStatisticsExample example);

    int deleteByPrimaryKey(Integer shopSaleStatisticsSerial);

    int insert(ShopSaleStatistics record);

    int insertSelective(ShopSaleStatistics record);

    List<ShopSaleStatistics> selectByExample(ShopSaleStatisticsExample example);

    ShopSaleStatistics selectByPrimaryKey(Integer shopSaleStatisticsSerial);

    int updateByExampleSelective(@Param("record") ShopSaleStatistics record, @Param("example") ShopSaleStatisticsExample example);

    int updateByExample(@Param("record") ShopSaleStatistics record, @Param("example") ShopSaleStatisticsExample example);

    int updateByPrimaryKeySelective(ShopSaleStatistics record);

    int updateByPrimaryKey(ShopSaleStatistics record);
}