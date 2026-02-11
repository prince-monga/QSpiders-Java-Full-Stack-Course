package com.jsp.driver;


import com.jsp.config.Config;
import com.jsp.model.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
  public   static void main(String[] args) {
      ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
      Teacher teacher=(Teacher) context.getBean(Teacher.class);
      System.out.println(employee.getId());
      System.out.println(employee.getName());
      System.out.println(employee.getRole());

    }
}
