package com.jsp.model;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
//    @Value(value = "Prince")  //---- 1. Field way Dependency Injection - in which we can pass field value above the field

    private String name;
    private  int id;
//
    public String getName() {
        return name;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
    public int getId() {
        return id;
    }
//    @Value(value = "123")    //-----Setter way
//    public void setId(int id) {
//        this.id = id;
//    }

    //3. constructor way Dependency injection
    public Student(@Value(value = "$name") String name,@Value(value = "$id") int id) {
        this.name = name;
        this.id = id;
    }

}
