package com.jsp.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private String name;
    private int cust_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }
}
