package com.assiment20query;



import com.assiment20query.StudentDAO;
import com.assiment20query.StudentData;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // Create EntityManagerFactory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
        EntityManager em = emf.createEntityManager();
        StudentDAO studentDAO = new StudentDAO(em);
        
        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====\n");
        
        try {
            // Add sample data
            System.out.println("1. Adding sample data...");
            studentDAO.addSampleData();
            
            System.out.println("\n2. Fetching all student records:");
            List<StudentData> allStudents = studentDAO.getAllStudents();
            allStudents.forEach(System.out::println);
            
            System.out.println("\n3. Students with age > 20:");
            studentDAO.getStudentsAgeGreaterThan(20).forEach(System.out::println);
            
            System.out.println("\n4. Computer Science department students:");
            studentDAO.getStudentsByDepartment("Computer Science").forEach(System.out::println);
            
            System.out.println("\n5. Students from Bangalore:");
            studentDAO.getStudentsByCity("Bangalore").forEach(System.out::println);
            
            System.out.println("\n6. Students with marks > 75:");
            studentDAO.getStudentsMarksGreaterThan(75).forEach(System.out::println);
            
            System.out.println("\n7. Female students:");
            studentDAO.getStudentsByGender("Female").forEach(System.out::println);
            
            System.out.println("\n8. Students admitted after 2023-01-01:");
            studentDAO.getStudentsAdmittedAfter(LocalDate.of(2023, 1, 1))
                     .forEach(System.out::println);
            
            System.out.println("\n9. Students whose name starts with 'A':");
            studentDAO.getStudentsByNameStartingWith("A").forEach(System.out::println);
            
            System.out.println("\n10. Students whose name contains 'an':");
            studentDAO.getStudentsByNameContaining("an").forEach(System.out::println);
            
            System.out.println("\n11. Students with marks between 60 and 80:");
            studentDAO.getStudentsByMarksBetween(60, 80).forEach(System.out::println);
            
            System.out.println("\n12. Students whose age is not 22:");
            studentDAO.getStudentsAgeNotEqual(22).forEach(System.out::println);
            
            System.out.println("\n13. Students not from Delhi:");
            studentDAO.getStudentsNotFromCity("Delhi").forEach(System.out::println);
            
            System.out.println("\n14. Students sorted by marks (descending):");
            studentDAO.getStudentsSortedByMarksDesc().forEach(System.out::println);
            
            System.out.println("\n15. Top 3 highest-scoring students:");
            studentDAO.getTop3HighestScoringStudents().forEach(System.out::println);
            
            System.out.println("\n16. Students sorted by admission date (oldest first):");
            studentDAO.getStudentsSortedByAdmissionDate().forEach(System.out::println);
            
            System.out.println("\n17. Total number of students: " + studentDAO.getTotalStudentsCount());
            
            System.out.println("\n18. Average marks: " + studentDAO.getAverageMarks());
            
            System.out.println("\n19. Maximum marks: " + studentDAO.getMaxMarks());
            
            System.out.println("\n20. Students count by department:");
            List<Object[]> deptCount = studentDAO.getStudentCountByDepartment();
            deptCount.forEach(arr -> 
                System.out.println("  Department: " + arr[0] + ", Count: " + arr[1]));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}