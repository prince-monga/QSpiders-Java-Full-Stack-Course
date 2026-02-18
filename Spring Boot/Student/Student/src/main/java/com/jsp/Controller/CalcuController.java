package com.jsp.Controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalcuController {
    @GetMapping(value = "/addition")
    public int add(@RequestParam  int a,@RequestParam  int b){
        return a+b;
    }
    //~ Multiply two numbers-
    @GetMapping(value = "/multiplys")
    public int multi(@RequestParam  int a,@RequestParam  int b){
        return a*b;
    }

    //~ Average -- http://localhost:8080/avg?a=1&b=2&c=6
    @GetMapping(value = "/avg")
    public int avg(@RequestParam List<Integer> n){
        int sum=0;
        for(int i:n){
            sum=sum+i;
        }
        return sum/n.size();
    }
    //cookies
    @GetMapping(value = "/addcookie")
    public int avg(@RequestParam List<Integer> n, HttpServletResponse resp){
        Cookie cookie=new Cookie("a","10");
        Cookie cookie1=new Cookie("b","20");
        Cookie cookie2=new Cookie("c","30");
        Cookie cookie3=new Cookie("d","40");
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
        resp.addCookie(cookie3);

        int sum=0;
        for(int i:n){
            sum=sum+i;
        }
        return sum/n.size();
    }

    @GetMapping(value = "/cookie")
    public String cookie(@CookieValue String a){
        return  a;
    }
}
