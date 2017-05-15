package dao;

import bean.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
    int deleteByPrimaryKey(String customerNumber);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String customerNumber);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}