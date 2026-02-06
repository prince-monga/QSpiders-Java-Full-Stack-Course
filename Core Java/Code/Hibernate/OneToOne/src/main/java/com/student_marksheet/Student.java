package com.student_marksheet;



import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String course;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "marksheet_id")
    private Marksheet marksheet;

    // getters & setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Marksheet getMarksheet() {
        return marksheet;
    }

    public void setMarksheet(Marksheet marksheet) {
        this.marksheet = marksheet;
    }
}
