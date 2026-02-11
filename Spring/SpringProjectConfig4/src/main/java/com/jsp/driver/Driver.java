package com.jsp.driver;

import com.jsp.config.Config;
import com.jsp.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    static void main() {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Product product=(Product) context.getBean(Product.class);
        System.out.println(product.getProductId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());

    }
}
