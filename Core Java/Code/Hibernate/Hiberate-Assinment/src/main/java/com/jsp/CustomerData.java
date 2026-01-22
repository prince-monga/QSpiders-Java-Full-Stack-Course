package com.jsp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customerdata")
public class CustomerData {

    @Id
    private int id;
    private String name;
    private String email;
    private long mobile;
    private String city;

    // Mandatory default constructor
    public CustomerData() {
    }

    // Parameterized constructor
    public CustomerData(int id, String name, String email, long mobile, String city) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.city = city;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
