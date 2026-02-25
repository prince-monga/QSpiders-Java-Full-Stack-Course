package com.jsp.student_crud.controller;

import com.jsp.student_crud.model.Student;
import com.jsp.student_crud.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService service;

    // Save Student
    @PostMapping
    @Operation(summary = "create object of student")
    @ApiResponse(responseCode = "201",description = "it will create object")

    public ResponseEntity<Student> save(@RequestBody Student student) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.saveStudent(student));
    }

    // Get All Students
    @GetMapping
    public List<Student> findAll() {
        return service.findAllStudent();
    }

    // Get Student By Roll Number
    @GetMapping("/{rol}")
    public Student findByRol(@PathVariable int rol) {
        return service.findByRol(rol);
    }

    // Update Student
    @PutMapping
    public Student update(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    // Delete Student
    @DeleteMapping("/{rol}")
    public String delete(@PathVariable int rol) {
        service.deleteStudent(rol);
        return "Delete successfully";
    }
}