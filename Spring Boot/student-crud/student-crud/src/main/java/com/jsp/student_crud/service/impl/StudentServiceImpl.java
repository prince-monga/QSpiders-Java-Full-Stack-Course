package com.jsp.student_crud.service.impl;


import com.jsp.student_crud.model.Student;
import com.jsp.student_crud.repository.StudentRepository;
import com.jsp.student_crud.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findByRol(int rol) {
        return studentRepository.findById(rol)
                .orElseThrow(() -> new RuntimeException("Student not found."));

//        if(op.isPersent()){
//            return  op.get();
//        }
//        else {
//            return new RuntimeException("Student not found");
//        }
    }
    @Override
    public List<Student> findAllStudent(){
        return studentRepository.findAll();
    }
    @Override
    public    Student updateStudent(Student student){
        Student student1= studentRepository.findById(student.getRol())
                .orElseThrow(() -> new RuntimeException("Student not found."));
         return studentRepository.save(student1);
    }

    @Override
    public void deleteStudent(int rol) {
       Student student= studentRepository.findById(rol)
                .orElseThrow(() -> new RuntimeException("Student not found."));
       studentRepository.delete(student);

    }
}
