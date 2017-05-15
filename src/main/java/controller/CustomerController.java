package controller;

import bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CustomerService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by shenglai on 2017/5/7.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @RequestMapping("/getNumber")
    public String getCustomerNumber(HttpServletRequest request){
        Customer customer = customerService.getCustomerByCustomerNumber("20170507001");
        System.out.print("啦啦啦" + customer.getCustomerNumber());
        return customer.getCustomerNumber();
    }
}
