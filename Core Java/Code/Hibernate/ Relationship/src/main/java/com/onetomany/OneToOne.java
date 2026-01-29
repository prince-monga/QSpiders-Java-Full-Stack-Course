package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOne {
	
	 
	  
	  
	  public static void main(String[] args) {
		  EntityManagerFactory emf =
		            Persistence.createEntityManagerFactory("java");
		  
	      EntityManager em = emf.createEntityManager();
	        EntityTransaction et = em.getTransaction();
		  
	  Customer c1=new Customer(12,"prince");
	  Product p1=new Product(101,"tv");
	  Product p2=new Product(102,"Mobile");
	  Product p3=new Product(103,"tv");
	  Product p4=new Product(104,"Laptop");
	  
	  List<Product> al=new ArrayList<Product>();
	  al.add(p4);
	  al.add(p1);
	  al.add(p2);
	  al.add(p3);
	  c1.setPro(al);
	  
	  et.begin(); 
//	  em.persist(p1);
//	  em.persist(p2);
//	  em.persist(p3);
//	  em.persist(p4);
//	  em.merge(c1);
	  
	  Customer c=em.find(Customer.class,c1.getCustomer_id());
	  et.commit();
	  System.out.println(c);
	  
	  
	  
}
}
