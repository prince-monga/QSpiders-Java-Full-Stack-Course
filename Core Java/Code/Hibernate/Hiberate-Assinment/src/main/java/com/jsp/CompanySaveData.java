package com.jsp;

import javax.persistence.*;

public class CompanySaveData {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // Insert or Update
    public CompanyData save(CompanyData companyData) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.merge(companyData);
        et.commit();

        em.close();
        return companyData;
    }

    // Find by ID
    public CompanyData find(int id) {

        EntityManager em = emf.createEntityManager();
        CompanyData companyData = em.find(CompanyData.class, id);
        em.close();

        return companyData;
    }

    // Update Location
    public CompanyData updateLocation(int id, String location) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        CompanyData companyData = em.find(CompanyData.class, id);

        if (companyData != null) {
            companyData.setLocation(location);
        }

        et.commit();
        em.close();

        return companyData;
    }

    // Delete
    public boolean delete(int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        CompanyData companyData = em.find(CompanyData.class, id);

        if (companyData != null) {
            em.remove(companyData);
            et.commit();
            em.close();
            return true;
        }

        et.commit();
        em.close();
        return false;
    }
}
