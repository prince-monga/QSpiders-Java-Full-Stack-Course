package com.jsp;

import javax.persistence.*;

public class TeacherSaveData {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // Insert or Update
    public TeacherData save(TeacherData teacherData) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.merge(teacherData);
        et.commit();

        em.close();
        return teacherData;
    }

    // Find by ID
    public TeacherData find(int id) {

        EntityManager em = emf.createEntityManager();
        TeacherData teacherData = em.find(TeacherData.class, id);
        em.close();

        return teacherData;
    }

    // Update Subject
    public TeacherData updateSubject(int id, String subject) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        TeacherData teacherData = em.find(TeacherData.class, id);

        if (teacherData != null) {
            teacherData.setSubject(subject);
        }

        et.commit();
        em.close();

        return teacherData;
    }

    // Delete
    public boolean delete(int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        TeacherData teacherData = em.find(TeacherData.class, id);

        if (teacherData != null) {
            em.remove(teacherData);
            et.commit();
            em.close();
            return true;
        }

        et.commit();
        em.close();
        return false;
    }
}
