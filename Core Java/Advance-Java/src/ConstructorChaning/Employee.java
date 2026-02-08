package ConstructorChaning;

public class Employee {
	 Employee() {
	        this("Unknown", 0);
	        System.out.println("Default Employee Constructor");
	    }

	    Employee(String name) {
	        this(name, 5000);
	        System.out.println("Employee Name Constructor");
	    }

	    Employee(String name, int salary) {
	        System.out.println("Name: " + name + ", Salary: " + salary);
	    }

	    public static void main(String[] args) {
	        Employee e = new Employee();
	    }

}
