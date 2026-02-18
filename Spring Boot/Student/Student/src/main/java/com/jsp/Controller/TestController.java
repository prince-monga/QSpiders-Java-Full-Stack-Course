package com.jsp.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/student-details")
    public Student detials(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("/Student");
        Student s1=new Student(121,"Prince",421.21f);

        return s1;
    }
}
