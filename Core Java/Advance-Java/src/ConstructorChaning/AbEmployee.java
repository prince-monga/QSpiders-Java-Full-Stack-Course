package ConstructorChaning;

abstract class Employee1 {
    Employee1() {
        System.out.println("Employee Abstract class constructor");
    }
}

class Manager1 extends Employee1 {
    Manager1() {
        super(); // call Employee constructor
        System.out.println("Manager class constructor");
    }
}

public class AbEmployee {
    public static void main(String[] args) {
        Manager1 m = new Manager1();
    }
}
