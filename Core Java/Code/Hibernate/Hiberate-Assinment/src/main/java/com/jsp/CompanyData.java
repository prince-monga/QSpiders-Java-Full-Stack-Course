package com.jsp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "companydata")
public class CompanyData {

    @Id
    private int id;
    private String name;
    private String location;
    private String domain;
    private int employees;
    private double revenue;

    // Mandatory default constructor
    public CompanyData() {
    }

    // Parameterized constructor
    public CompanyData(int id, String name, String location,
                       String domain, int employees, double revenue) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.domain = domain;
        this.employees = employees;
        this.revenue = revenue;
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

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getEmployees() {
        return employees;
    }
    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public double getRevenue() {
        return revenue;
    }
    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}
