package com.jsp;

import javax.persistence.*;

public class ProductSaveData {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // Insert or Update
    public ProductData save(ProductData productData) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.merge(productData);
        et.commit();

        em.close();
        return productData;
    }

    // Find by ID
    public ProductData find(int id) {

        EntityManager em = emf.createEntityManager();
        ProductData productData = em.find(ProductData.class, id);
        em.close();

        return productData;
    }

    // Update Price
    public ProductData updatePrice(int id, double price) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        ProductData productData = em.find(ProductData.class, id);

        if (productData != null) {
            productData.setPrice(price);
        }

        et.commit();
        em.close();

        return productData;
    }

    // Delete
    public boolean delete(int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        ProductData productData = em.find(ProductData.class, id);

        if (productData != null) {
            em.remove(productData);
            et.commit();
            em.close();
            return true;
        }

        et.commit();
        em.close();
        return false;
    }
}
