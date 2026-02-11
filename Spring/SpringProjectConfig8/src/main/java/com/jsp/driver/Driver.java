package com.jsp.driver;


import com.jsp.config.Config;
import com.jsp.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
  public   static void main(String[] args) {
      ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
      Employee employee=(Employee) context.getBean(Employee.class);
      employee.setId(123);
      employee.setName("Prince");
      employee.setRole("Devops eng");
      System.out.println(employee.getId());
      System.out.println(employee.getName());
      System.out.println(employee.getRole());

    }
}
