package com.jsp;

import javax.persistence.*;

public class CustomerSaveData {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // Insert or Update
    public CustomerData save(CustomerData customerData) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.merge(customerData);
        et.commit();

        em.close();
        return customerData;
    }

    // Find by ID
    public CustomerData find(int id) {

        EntityManager em = emf.createEntityManager();
        CustomerData customerData = em.find(CustomerData.class, id);
        em.close();

        return customerData;
    }

    // Update City
    public CustomerData updateCity(int id, String city) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        CustomerData customerData = em.find(CustomerData.class, id);

        if (customerData != null) {
            customerData.setCity(city);
        }

        et.commit();
        em.close();

        return customerData;
    }

    // Delete
    public boolean delete(int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        CustomerData customerData = em.find(CustomerData.class, id);

        if (customerData != null) {
            em.remove(customerData);
            et.commit();
            em.close();
            return true;
        }

        et.commit();
        em.close();
        return false;
    }
}
