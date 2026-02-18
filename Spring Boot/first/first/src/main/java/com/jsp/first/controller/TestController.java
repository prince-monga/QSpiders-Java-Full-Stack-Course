package com.jsp.first.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
//    @RequestMapping("/hello")

    @GetMapping(value = "/hello")
    public String hello(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("/hello");
        System.out.println(req);
        System.out.println(resp);
        //logic
        return "hello.html";

    }
    @PostMapping(value = "/hellopost")
    public String hellopost(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("/hellopost");
        System.out.println(req);
        System.out.println(resp);
        //logic
        return "--Post method--";

    }
    @PostMapping(value = "/save")
    public Person save(@RequestBody Person person)
    {
        return person;
    }
    @GetMapping(value = "/find")
    public String find(@RequestParam("id") int id,@RequestParam("name") String name)
    {
        return id+name;
    }

}

