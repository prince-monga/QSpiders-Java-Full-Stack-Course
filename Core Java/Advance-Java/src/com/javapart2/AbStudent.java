package ConstructorChaning;

abstract class Student {
    Student() {
        System.out.println("Student Abstract class constructor");
    }
}

class SchoolStudent extends Student {
    SchoolStudent() {
        super();
        System.out.println("SchoolStudent class constructor");
    }
}

public class AbStudent {
    public static void main(String[] args) {
        SchoolStudent s = new SchoolStudent();
    }
}
