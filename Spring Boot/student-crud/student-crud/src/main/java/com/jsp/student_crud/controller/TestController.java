package com.jsp.student_crud.controller;

import com.jsp.student_crud.model.Student;

public class TestController {
    public static void main(String[] args) {
        Student s=new Student(121,"Prince",9849223l,"abc@gmail.com");
        System.out.println(s);
        s.setEmail("Prince@gmail.com");
        System.out.println("update email: "+ s.getEmail());
        System.out.println(s);
    }
}
