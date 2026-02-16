package com.jsp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Student {
    private String name;
    private int id;
    @Autowired
    @Qualifier("createObjAdd1")
    private Address address;
    @Autowired
    @Qualifier("contactObj1")
    private ContactDetails contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactDetails getContact() {
        return contact;
    }

    public void setContact(ContactDetails contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                ", contact=" + contact +
                '}';
    }
}
