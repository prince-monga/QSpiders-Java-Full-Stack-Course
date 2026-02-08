package com.javapart2;

class Employee {
    void work() { System.out.println("Employee works"); }
}

class Developer extends Employee {
    String lang = "Java";
}

class Manager extends Employee {
    int teamSize = 10;
}

public class Test4 {
    public static void main(String[] args) {
        Employee e = new Developer();  // upcasting
        
        if(e instanceof Developer) {
            Developer d = (Developer)e;
            System.out.println("Language = " + d.lang);
        }
        if(e instanceof Manager) {
            Manager m = (Manager)e;
            System.out.println("Team size = " + m.teamSize);
        }
    }
}
