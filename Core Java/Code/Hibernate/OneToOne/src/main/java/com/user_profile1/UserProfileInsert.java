package com.user_profile1;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserProfileInsert {

    // EntityManagerFactory should be created ONCE
    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // 🔹 Sample User data
        User user = new User();
        user.setUsername("prince");
        user.setEmail1("prince@gmail.com");

        // 🔹 Sample Profile data
        Profile profile = new Profile();
        profile.setFullName("Prince Monga");
        profile.setAddress("India");

        // 🔹 One-To-One mapping
        user.setProfile(profile);

        // 🔹 INSERT only
        et.begin();
        em.persist(user);   // Profile auto-inserted (CascadeType.ALL)
        et.commit();

        em.close();
        emf.close();

        System.out.println("User and Profile inserted successfully");
    }
}

