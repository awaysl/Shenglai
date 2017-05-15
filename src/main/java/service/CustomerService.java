package service;

import bean.Customer;
import org.springframework.stereotype.Component;

/**
 * Created by shenglai on 2017/5/7.
 */
public interface CustomerService {
    Customer getCustomerByCustomerNumber(String customerNumber);
}
