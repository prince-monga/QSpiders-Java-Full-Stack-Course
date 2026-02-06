package com.car_registration;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarRegistrationInsert {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // Sample Car
        Car car = new Car();
        car.setBrand("Hyundai");
        car.setModel("Creta");

        // Sample Registration
        Registration reg = new Registration();
        reg.setRegistrationNumber("HR26-AB-1234");
        reg.setRto("Gurgaon");

        // One-To-One mapping
        car.setRegistration(reg);

        // INSERT
        et.begin();
        em.persist(car);   // Registration auto-inserted (CascadeType.ALL)
        et.commit();

        em.close();
        emf.close();

        System.out.println("✅ Car and Registration inserted successfully");
    }
}
