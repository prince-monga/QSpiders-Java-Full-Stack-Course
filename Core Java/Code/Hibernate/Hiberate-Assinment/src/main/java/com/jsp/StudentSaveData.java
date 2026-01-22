package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentSaveData {

    // EntityManagerFactory should be created ONCE
    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // 🔹 Insert or Update Student
    public StudentData save(StudentData studentData) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.merge(studentData);   // merge = insert OR update
        et.commit();

        em.close();
        return studentData;
    }

    // 🔹 Find Student by ID
    public StudentData find(int id) {

        EntityManager em = emf.createEntityManager();
        StudentData studentData = em.find(StudentData.class, id);
        em.close();

        return studentData;
    }

    // 🔹 Update Student Name
    public StudentData updateName(int id, String name) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        StudentData studentData = em.find(StudentData.class, id);

        if (studentData != null) {
            studentData.setName(name);
        }

        et.commit();
        em.close();

        return studentData;
    }

    // 🔹 Delete Student by ID
    public boolean delete(int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        StudentData studentData = em.find(StudentData.class, id);

        if (studentData != null) {
            em.remove(studentData);
            et.commit();
            em.close();
            return true;
        }

        et.commit();
        em.close();
        return false;
    }
}
