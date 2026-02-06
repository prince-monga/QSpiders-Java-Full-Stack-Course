package com.bankAccount_atmcard;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BankAccountATMInsert {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // Sample Bank Account
        BankAccount account = new BankAccount();
        account.setAccountNumber("1234567890");
        account.setBankName("SBI");

        // Sample ATM Card
        ATMCard card = new ATMCard();
        card.setCardNumber("4111-2222-3333-4444");
        card.setExpiryDate("12/30");

        // One-To-One mapping
        account.setAtmCard(card);

        // INSERT
        et.begin();
        em.persist(account);   // ATMCard auto-inserted (CascadeType.ALL)
        et.commit();

        em.close();
        emf.close();

        System.out.println("✅ BankAccount and ATMCard inserted successfully");
    }
}
