package com.jsp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departmentdata")
public class DepartmentData {

    @Id
    private int id;
    private String name;
    private String hod;
    private int totalEmployees;
    private String location;

    // Mandatory default constructor
    public DepartmentData() {
    }

    // Parameterized constructor
    public DepartmentData(int id, String name, String hod,
                          int totalEmployees, String location) {
        this.id = id;
        this.name = name;
        this.hod = hod;
        this.totalEmployees = totalEmployees;
        this.location = location;
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

    public String getHod() {
        return hod;
    }
    public void setHod(String hod) {
        this.hod = hod;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }
    public void setTotalEmployees(int totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
