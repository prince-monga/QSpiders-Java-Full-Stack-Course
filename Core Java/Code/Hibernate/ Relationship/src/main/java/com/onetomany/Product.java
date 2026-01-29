package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int pro_id;
	private String pro_name;
	
	
	public int getPro_id() {
		return pro_id;
	}


	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}


	public String getPro_name() {
		return pro_name;
	}


	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	
	public Product(int pro_id, String pro_name) {
		this.pro_id = pro_id;
		this.pro_name = pro_name;
	}
	public Product() {
		
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Product [pro_id=" + pro_id + ", pro_name=" + pro_name + "]";
	}
	
	
}
