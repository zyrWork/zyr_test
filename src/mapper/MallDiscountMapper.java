package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.MallDiscount;
import pojo.MallDiscountExample;

public interface MallDiscountMapper {
    long countByExample(MallDiscountExample example);

    int deleteByExample(MallDiscountExample example);

    int deleteByPrimaryKey(Integer mallDiscountSerial);

    int insert(MallDiscount record);

    int insertSelective(MallDiscount record);

    List<MallDiscount> selectByExample(MallDiscountExample example);

    MallDiscount selectByPrimaryKey(Integer mallDiscountSerial);

    int updateByExampleSelective(@Param("record") MallDiscount record, @Param("example") MallDiscountExample example);

    int updateByExample(@Param("record") MallDiscount record, @Param("example") MallDiscountExample example);

    int updateByPrimaryKeySelective(MallDiscount record);

    int updateByPrimaryKey(MallDiscount record);
}