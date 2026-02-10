package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");
        Car car= (Car) context.getBean("car");

        System.out.println(car);

        System.out.println(car.getCar_company());
        System.out.println(car.getCar_color());
        System.out.println(car.getCar_price());
    }
}
