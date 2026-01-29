package com.jsp.entity;

import java.util.List;

import javax.management.Query;
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
	
	public void findAll() {
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		//Positioned parameter
//		String q="select s from Student s where s.id=?1 or s.name=?2";
//		
//		javax.persistence.Query query=entityManager.createQuery(q);
//		query.setParameter(1,12);
//		query.setParameter(2,"Prince");
		
		
		//named parameter
        String q1="select s from Student s where s.id=:id or s.name=:name";
		
		javax.persistence.Query query1=entityManager.createQuery(q1);
		query1.setParameter("id",7);
		query1.setParameter("name","sincyyy");
		
//		List<Student> l=query.getResultList();
		List<Student> l1=query1.getResultList();
		System.out.println(l1);
	}
	
	public void findParticulare() {
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		String q="select s from Student s where s.id=15";
		
		javax.persistence.Query query=entityManager.createQuery(q);
		
		List<Student> l=query.getResultList();
		
		System.out.println(l);
	}
	
	
}
