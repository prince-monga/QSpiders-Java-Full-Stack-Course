package ConstructorChaning;

public class Student {

	 Student() {
	        this("NoName", 0);
	        System.out.println("Default Student Constructor");
	    }

	    Student(String name) {
	        this(name, 1);
	        System.out.println("Student Name Constructor");
	    }

	    Student(String name, int roll) {
	        System.out.println("Name: " + name + ", Roll: " + roll);
	    }

	    public static void main(String[] args) {
	        Student s = new Student();
	    }
}
