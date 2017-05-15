package controller;

import bean.Customer;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CustomerService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;
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

    public static void main(String[] args){
        Collection collection = new ArrayList();
        Collection collection1 = new HashSet();
        collection.add("aaaa");
        collection.add("bbbb");
        collection1.add("cccc");
        collection1.add("bbbb");

        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            String a = (String)iterator.next();
            System.out.print(a);
        }
        //System.out.print(collection.toArray());

       /* collection.removeAll(collection1);
        System.out.print(collection);
        collection.retainAll(collection1);
        System.out.print(collection1.isEmpty());*/
    }
}
