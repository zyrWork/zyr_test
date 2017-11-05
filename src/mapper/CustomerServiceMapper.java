package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.CustomerService;
import pojo.CustomerServiceExample;

public interface CustomerServiceMapper {
    long countByExample(CustomerServiceExample example);

    int deleteByExample(CustomerServiceExample example);

    int deleteByPrimaryKey(Integer customerServiceSerial);

    int insert(CustomerService record);

    int insertSelective(CustomerService record);

    List<CustomerService> selectByExample(CustomerServiceExample example);

    CustomerService selectByPrimaryKey(Integer customerServiceSerial);

    int updateByExampleSelective(@Param("record") CustomerService record, @Param("example") CustomerServiceExample example);

    int updateByExample(@Param("record") CustomerService record, @Param("example") CustomerServiceExample example);

    int updateByPrimaryKeySelective(CustomerService record);

    int updateByPrimaryKey(CustomerService record);
}