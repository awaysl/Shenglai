package serviceImp;

import bean.Customer;
import dao.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import service.CustomerService;

import javax.annotation.Resource;

/**
 * Created by shenglai on 2017/5/7.
 */
@Service
public class CustomerServiceImp implements CustomerService{

    @Resource
    private CustomerMapper customerMapper;

    public Customer getCustomerByCustomerNumber(String customerNumber) {
        Customer customer = customerMapper.selectByPrimaryKey(customerNumber);
        return customer;
    }

}
