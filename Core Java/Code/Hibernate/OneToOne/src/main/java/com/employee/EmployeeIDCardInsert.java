package com.employee;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeIDCardInsert {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // Sample Employee
        Employee emp = new Employee();
        emp.setName("Rahul");
        emp.setDepartment("IT");

        // Sample ID Card
        IDCard card = new IDCard();
        card.setCardNumber("ID-IT-101");
        card.setIssueDate("2026-01-01");

        // One-To-One mapping
        emp.setIdCard(card);

        // INSERT
        et.begin();
        em.persist(emp);   // IDCard auto-inserted (CascadeType.ALL)
        et.commit();

        em.close();
        emf.close();

        System.out.println("✅ Employee and IDCard inserted successfully");
    }
}
