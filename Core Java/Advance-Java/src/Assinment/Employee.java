package Assinment;

import java.util.ArrayList;

public class Employee {
	int id;
	String name;
	double salary;
	String email;
	long contact;
	
	Employee(int id,String name,double salary,String email,long contact){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.email=email;
		this.contact=contact;
	}
	
	public static void main(String[] args) {
		Employee emp1=new Employee(123,"prince",34783.45d,"princemonga@gmail.com",973828723l);
		Employee emp2=new Employee(123,"prince",34783.45d,"princemonga@gmail.com",973828723l);
		ArrayList<Employee> al=new ArrayList();
		
		al.add(emp1);
		al.add(emp2);
		
		System.out.println(al.get(1).id);
		
	}

}
