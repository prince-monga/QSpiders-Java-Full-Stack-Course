package com.jsp;

import javax.persistence.*;

public class DepartmentSaveData {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // Insert / Update
    public DepartmentData save(DepartmentData departmentData) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.merge(departmentData);
        et.commit();

        em.close();
        return departmentData;
    }

    // Find
    public DepartmentData find(int id) {

        EntityManager em = emf.createEntityManager();
        DepartmentData departmentData = em.find(DepartmentData.class, id);
        em.close();

        return departmentData;
    }

    // Update HOD
    public DepartmentData updateHod(int id, String hod) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        DepartmentData departmentData = em.find(DepartmentData.class, id);

        if (departmentData != null) {
            departmentData.setHod(hod);
        }

        et.commit();
        em.close();
        return departmentData;
    }

    // Delete
    public boolean delete(int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        DepartmentData departmentData = em.find(DepartmentData.class, id);

        if (departmentData != null) {
            em.remove(departmentData);
            et.commit();
            em.close();
            return true;
        }

        et.commit();
        em.close();
        return false;
    }
}
