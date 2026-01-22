package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonSaveData {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java");
		public static void main(String[] args) {
			
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();			
			
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
		PersonData p=new PersonData();
		p.setId(1);
		p.setName("Prince");
		p.setAge(21);
		p.setDob("22-12-04");
		
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
		
		}
		
		public PersonData save(PersonData personData) {
			EntityManager entityManager=entityManagerFactory.createEntityManager();			
			
			EntityTransaction entityTransaction=entityManager.getTransaction();
			
			entityTransaction.begin();
			entityManager.merge(personData);
			entityTransaction.commit();
			return personData;
		}
		public PersonData find(int id) {
			EntityManager entityManager=entityManagerFactory.createEntityManager();			
			
			EntityTransaction entityTransaction=entityManager.getTransaction();
			
			PersonData personData=entityManager.find(PersonData.class,1);
			
			return personData;
			
		}
		public PersonData updateName(int id, String name) {

			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();

			PersonData personData = entityManager.find(PersonData.class, id);

			if (personData != null) {
				personData.setName(name); // UPDATE happens here
			}

			entityTransaction.commit();

			return personData;
		}

}
