package com.jsp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacherdata")
public class TeacherData {

    @Id
    private int id;
    private String name;
    private String subject;
    private double salary;
    private int experience; // years

    // Mandatory default constructor
    public TeacherData() {
    }

    // Parameterized constructor
    public TeacherData(int id, String name, String subject, double salary, int experience) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.salary = salary;
        this.experience = experience;
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

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
}
