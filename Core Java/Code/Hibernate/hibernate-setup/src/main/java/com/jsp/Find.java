package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java"); 
		//Conneect the Java Application to DataBase---  it check Persistence "java" matches with the persistence.xml inside persistence- unit name is matched or not
		
		System.out.println(entityManagerFactory);
		
		
		//
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		Person person=entityManager.find(Person.class,123);
		
		if(person!=null) {
			System.out.println(person.getName());
			person.setName("prbbkr ");
			
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
			System.out.println(person.getName());
		}	
	}
}
