package com.jsp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentData {

    @Id
    private int id;
    private String name;
    private int age;
    private String course;
    private double fees;

    // Default constructor (MANDATORY for JPA)
    public StudentData() {
    }

    // Parameterized constructor
    public StudentData(int id, String name, int age, String course, double fees) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.fees = fees;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}
