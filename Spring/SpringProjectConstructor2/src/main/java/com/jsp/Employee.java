package com.jsp;

public class Employee {
    private int empId;
    private String empName;
    private String empRol;

    public Employee(int empId, String empName, String empRol) {
        this.empId = empId;
        this.empName = empName;
        this.empRol = empRol;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empRol='" + empRol + '\'' +
                '}';
    }
}
