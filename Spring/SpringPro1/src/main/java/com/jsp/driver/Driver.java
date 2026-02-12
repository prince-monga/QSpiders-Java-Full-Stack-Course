package com.jsp.driver;

import com.jsp.config.Config;
import com.jsp.model.Student;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    static void main(String[] args) {
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);

        Student student=context.getBean(Student.class);

        System.out.println(student.getId());
        System.out.println(student.getName());



    }
}
