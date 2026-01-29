package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;

import com.onetomany.Customer;
import com.onetomany.Product;

public class ProductDAO {
  public void sampleData() {
	  Customer c=new Customer();
	  
	  Product p1=new Product(101,"tv");
	  Product p2=new Product(102,"Mobile");
	  Product p3=new Product(103,"tv");
	  Product p4=new Product(104,"Laptop");
	  
	  List<Product> al=new ArrayList<Product>();
	  al.add(p4);
	  al.add(p1);
	  al.add(p2);
	  al.add(p3);
	  
	  c.setPro(al);
	  
	  entityManager.getTransaction().begin();  
	  
  }
}
