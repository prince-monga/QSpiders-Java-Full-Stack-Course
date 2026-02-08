package com.inhertence;

public class Emp {
    String name;
    int salary;

    void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Emp {
    int teamSize;

    void showManagerInfo() {
        System.out.println("Manager Team Size: " + teamSize);
    }

    public static void main(String[] args) {
        Manager m = new Manager();

       
        m.name = "Prince";
        m.salary = 50000;
        m.teamSize = 10;

        
        m.showDetails();       
        m.showManagerInfo();  
    }
}
