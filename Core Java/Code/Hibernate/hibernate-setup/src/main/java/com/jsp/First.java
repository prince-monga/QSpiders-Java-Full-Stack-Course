package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class First {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java"); 
		//Conneect the Java Application to DataBase---  it check Persistence "java" matches with the persistence.xml inside persistence- unit name is matched or not
		
		System.out.println(entityManagerFactory);
		
		
		//
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		Person p=new Person(); //Create object
		p.setId(123);  
		p.setName("AJ");
		p.setAge(25);
		p.setDob("12-01-09");
	
		entityTransaction.begin(); //It start the transaction
		entityManager.persist(p); //Convert java object -> Sql INSERT  and Store in DB Table
		entityTransaction.commit(); //save the data permentaly and end the transaction
		
		
	}

}
