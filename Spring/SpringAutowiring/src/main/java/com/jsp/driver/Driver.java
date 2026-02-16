package com.jsp.driver;

import com.jsp.config.Config;
import com.jsp.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
       Student student=(Student) context.getBean(Student.class);
        System.out.println(student);
    }
}

