package com.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int customer_id;
	private String name;
	
	@OneToMany
	List<Product> pro;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getPro() {
		return pro;
	}

	public void setPro(List<Product> pro) {
		this.pro = pro;
	}

	public Customer(int customer_id, String name) {
		this.customer_id = customer_id;
		this.name = name;
	}
	public Customer() {
		
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + ", pro=" + pro + "]";
	}

	
	
}
