package com.jsp.Controller;

public class Student {
    private int rol;
    private String name;
    private float marks;

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public Student(int rol, String name, float marks) {
        this.rol = rol;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rol=" + rol +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
