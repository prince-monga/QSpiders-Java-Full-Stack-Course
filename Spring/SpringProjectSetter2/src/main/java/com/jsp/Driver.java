package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");
        Employee emp= (Employee) context.getBean("employee");

        System.out.println(emp);

        System.out.println(emp.getEmpId());
        System.out.println(emp.getEmpName());
        System.out.println(emp.getEmpRol());
    }
}
