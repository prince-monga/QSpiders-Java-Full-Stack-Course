package com.jsp.driver;

import com.jsp.config.Config;
import com.jsp.model.Customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
  public   static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Customer customer=(Customer) context.getBean(Customer.class);
        System.out.println(customer.getCust_id());
        System.out.println(customer.getName());

    }
}
