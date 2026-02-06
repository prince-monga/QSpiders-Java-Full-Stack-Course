package com.student_marksheet;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentMarksheetInsert {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // Sample Student
        Student student = new Student();
        student.setName("Amit");
        student.setCourse("BCA");

        // Sample Marksheet
        Marksheet marksheet = new Marksheet();
        marksheet.setTotalMarks(450);
        marksheet.setGrade("A");

        // One-To-One mapping
        student.setMarksheet(marksheet);

        // INSERT
        et.begin();
        em.persist(student);   // Marksheet auto-inserted (CascadeType.ALL)
        et.commit();

        em.close();
        emf.close();

        System.out.println("✅ Student and Marksheet inserted successfully");
    }
}
