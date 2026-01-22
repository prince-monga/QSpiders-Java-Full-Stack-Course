package com.jsp.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.exception.StudentNotFoundException;

public class StudentDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java"); 
	
	public Student save(Student student) throws StudentNotFoundException {
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		Student student1=entityManager.find(Student.class, student.getId());
		if(student1!=null) {
			throw new StudentNotFoundException("Student Already registerd.");
		}
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	
	public Student update(int id,String password) throws StudentNotFoundException  {
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		Student student=entityManager.find(Student.class,id);
		
		if(student!=null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		}
		else {
			throw new StudentNotFoundException("Student with rol number not register");
		}
		
		
	}
	
	
	
	
}
