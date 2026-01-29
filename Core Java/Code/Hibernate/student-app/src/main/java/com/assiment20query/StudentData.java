package com.assiment20query;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
public class StudentData {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "age")
    private Integer age;
    
    @Column(name = "department")
    private String department;
    
    @Column(name = "city")
    private String city;
    
    @Column(name = "marks")
    private Double marks;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "admission_date")
    private LocalDate admissionDate;
    
    // Constructors
    public StudentData() {}
    
    public StudentData(String name, Integer age, String department, String city, 
                       Double marks, String gender, LocalDate admissionDate) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.city = city;
        this.marks = marks;
        this.gender = gender;
        this.admissionDate = admissionDate;
    }
    
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    
    public Double getMarks() { return marks; }
    public void setMarks(Double marks) { this.marks = marks; }
    
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    
    public LocalDate getAdmissionDate() { return admissionDate; }
    public void setAdmissionDate(LocalDate admissionDate) { this.admissionDate = admissionDate; }
    
    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Age: %d, Dept: %s, City: %s, Marks: %.2f, Gender: %s, Admission: %s",
                id, name, age, department, city, marks, gender, admissionDate);
    }
}