package com.jsp.first.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("/hello");
        System.out.println(req);
        System.out.println(resp);

        //logic
        return "hello.html";

    }

}
