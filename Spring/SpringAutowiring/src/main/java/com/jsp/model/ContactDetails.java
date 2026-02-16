package com.jsp.model;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ContactDetails {

    @Value(value = "323233")
    private long contact;

    @Value(value = "prince@gmail.com")
    private String email;

    @Override
    public String toString() {
        return "{" +
                "contact=" + contact +
                ", email='" + email + '\'' +
                '}';
    }
}
