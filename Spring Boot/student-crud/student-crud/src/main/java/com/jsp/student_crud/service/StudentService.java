package com.jsp.student_crud.service;

import com.jsp.student_crud.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    Student findByRol(int rol);
     List<Student> findAllStudent();

    Student updateStudent(Student student);

    void deleteStudent(int rol);
}
