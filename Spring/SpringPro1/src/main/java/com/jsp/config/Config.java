package com.jsp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.jsp")
@PropertySource("app.properties")
public class Config {
//    @Bean(value="student")
//    @Scope(value = "prototype")
//    public Student student(){
//        return new Student();
//    }
}
