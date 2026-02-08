package com.javapart2;

import java.io.Serializable;

public class BeanClass1 extends Object /*implements Serializable */{
	//5 attribute employee class
	
	
	private String emp_name,emp_role;
	private int emp_id;
	private double emp_salary;
	private long contact; 
	
	//---getter
	
	public int getEmpId() {
		return emp_id;
	}
	public double getEmpSalary() {
		return emp_salary;
	}
	public String getEmpName() {
		return emp_name;
	}
	public String getEmpRole() {
		return emp_role;
	}
	
	public long getEmpContact() {
		return contact;
	}
//---setter 


	public void setEmpId(int emp_id) {
		this.emp_id=emp_id;
	}
	public void setEmpSalary(double emp_salary) {
		this.emp_salary=emp_salary;
	}
	public void setEmpName(String emp_name) {
		this.emp_name=emp_name;
	}
	public void setEmpRole(String emp_role) {
		 this.emp_role=emp_role;
	}
	
	public void setEmpContact(long contact) {
		this.contact=contact;
	}
	
	//hashCode method in object class
	public int hashCode() {
		return this.emp_id;
	}
	
	//equals methods-compare actuall data
	public boolean equals(Object obj) {
		
		BeanClass1 b1=(BeanClass1) obj;
		return this.emp_id==b1.getEmpId()
			&& this.emp_name==b1.getEmpName()
			&& this.emp_role==b1.getEmpRole()
			&& this.contact==b1.getEmpContact()
			&& this.emp_salary==b1.getEmpSalary();
		
	}
}
	
	

