package com.jsp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientdata")
public class ClientData {

    @Id
    private int id;
    private String name;
    private String company;
    private String email;
    private long contact;
    private String country;

    // Mandatory default constructor
    public ClientData() {
    }

    // Parameterized constructor
    public ClientData(int id, String name, String company,
                      String email, long contact, String country) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.email = email;
        this.contact = contact;
        this.country = country;
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

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }
    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
