package com.jsp;

public class Student {
    private String name;
    private int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }
}
