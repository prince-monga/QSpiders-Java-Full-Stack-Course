package com.jsp;

import javax.persistence.*;

public class ClientSaveData {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // Insert or Update
    public ClientData save(ClientData clientData) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.merge(clientData);
        et.commit();

        em.close();
        return clientData;
    }

    // Find by ID
    public ClientData find(int id) {

        EntityManager em = emf.createEntityManager();
        ClientData clientData = em.find(ClientData.class, id);
        em.close();

        return clientData;
    }

    // Update Company
    public ClientData updateCompany(int id, String company) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        ClientData clientData = em.find(ClientData.class, id);

        if (clientData != null) {
            clientData.setCompany(company);
        }

        et.commit();
        em.close();

        return clientData;
    }

    // Delete
    public boolean delete(int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        ClientData clientData = em.find(ClientData.class, id);

        if (clientData != null) {
            em.remove(clientData);
            et.commit();
            em.close();
            return true;
        }

        et.commit();
        em.close();
        return false;
    }
}
