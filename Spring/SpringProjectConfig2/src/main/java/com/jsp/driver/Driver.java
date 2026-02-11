package com.jsp.driver;

import com.jsp.config.Config;
import com.jsp.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    static void main() {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
         Person person=(Person) context.getBean(Person.class);
        System.out.println(person.getAge());
        System.out.println(person.getName());

    }
}
