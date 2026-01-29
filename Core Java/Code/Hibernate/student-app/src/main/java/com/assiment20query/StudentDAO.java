package com.assiment20query;

import com.assiment20query.StudentData;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class StudentDAO {
    
    private EntityManager entityManager;
    
    public StudentDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    // 1. Fetch all student records
    public List<StudentData> getAllStudents() {
        return entityManager.createQuery("SELECT s FROM StudentData s", StudentData.class)
                .getResultList();
    }
    
    // 2. Display only name and department of students
    public List<Object[]> getNameAndDepartment() {
        return entityManager.createQuery("SELECT s.name, s.department FROM StudentData s").getResultList();
    }
    
    // 3. List students whose age is greater than 20
    public List<StudentData> getStudentsAgeGreaterThan(int age) {
        return entityManager.createQuery("SELECT s FROM StudentData s WHERE s.age > :age", StudentData.class)
                .setParameter("age", age)
                .getResultList();
    }
    
    // 4. Find students belonging to the Computer Science department
    public List<StudentData> getStudentsByDepartment(String department) {
        return entityManager.createQuery("SELECT s FROM StudentData s WHERE s.department = :dept", StudentData.class)
                .setParameter("dept", department)
                .getResultList();
    }
    
    // 5. Retrieve students from the city Bangalore
    public List<StudentData> getStudentsByCity(String city) {
        return entityManager.createQuery("SELECT s FROM StudentData s WHERE s.city = :city", StudentData.class)
                .setParameter("city", city)
                .getResultList();
    }
    
    // 6. Show students who scored more than 75 marks
    public List<StudentData> getStudentsMarksGreaterThan(double marks) {
        return entityManager.createQuery("SELECT s FROM StudentData s WHERE s.marks > :marks", StudentData.class)
                .setParameter("marks", marks)
                .getResultList();
    }
    
    // 7. Get students whose gender is Female
    public List<StudentData> getStudentsByGender(String gender) {
        return entityManager.createQuery("SELECT s FROM StudentData s WHERE s.gender = :gender", StudentData.class)
                .setParameter("gender", gender)
                .getResultList();
    }
    
    // 8. Display students admitted after 2023-01-01
    public List<StudentData> getStudentsAdmittedAfter(LocalDate date) {
        return entityManager.createQuery("SELECT s FROM StudentData s WHERE s.admissionDate > :date", StudentData.class)
                .setParameter("date", date)
                .getResultList();
    }
    
    // 9. Find students whose name starts with A
    public List<StudentData> getStudentsByNameStartingWith(String prefix) {
        return entityManager.createQuery("SELECT s FROM StudentData s WHERE s.name LIKE :prefix || '%'", StudentData.class)
                .setParameter("prefix", prefix)
                .getResultList();
    }
    
    // 10. Retrieve students whose name contains "an"
    public List<StudentData> getStudentsByNameContaining(String infix) {
        return entityManager.createQuery("SELECT s FROM StudentData s WHERE s.name LIKE '%' || :infix || '%'", StudentData.class)
                .setParameter("infix", infix)
                .getResultList();
    }
    
    // 11. Display students whose marks are between 60 and 80
    public List<StudentData> getStudentsByMarksBetween(double min, double max) {
        return entityManager.createQuery("SELECT s FROM StudentData s WHERE s.marks BETWEEN :min AND :max", StudentData.class)
                .setParameter("min", min)
                .setParameter("max", max)
                .getResultList();
    }
    
    // 12. List students whose age is not equal to 22
    public List<StudentData> getStudentsAgeNotEqual(int age) {
        return entityManager.createQuery("SELECT s FROM StudentData s WHERE s.age != :age", StudentData.class)
                .setParameter("age", age)
                .getResultList();
    }
    
    // 13. Fetch students not from Delhi
    public List<StudentData> getStudentsNotFromCity(String city) {
        return entityManager.createQuery("SELECT s FROM StudentData s WHERE s.city != :city", StudentData.class)
                .setParameter("city", city)
                .getResultList();
    }
    
    // 14. Sort students by marks in descending order
    public List<StudentData> getStudentsSortedByMarksDesc() {
        return entityManager.createQuery("SELECT s FROM StudentData s ORDER BY s.marks DESC", StudentData.class)
                .getResultList();
    }
    
    // 15. Display the top 3 highest-scoring students
    public List<StudentData> getTop3HighestScoringStudents() {
        return entityManager.createQuery("SELECT s FROM StudentData s ORDER BY s.marks DESC", StudentData.class)
                .setMaxResults(3)
                .getResultList();
    }
    
    // 16. List students ordered by admission date (oldest first)
    public List<StudentData> getStudentsSortedByAdmissionDate() {
        return entityManager.createQuery("SELECT s FROM StudentData s ORDER BY s.admissionDate ASC", StudentData.class)
                .getResultList();
    }
    
    // 17. Count total number of students
    public long getTotalStudentsCount() {
        return (Long) entityManager.createQuery("SELECT COUNT(s) FROM StudentData s")
                .getSingleResult();
    }
    
    // 18. Find the average marks of all students
    public double getAverageMarks() {
        Object result = entityManager.createQuery("SELECT AVG(s.marks) FROM StudentData s")
                .getSingleResult();
        return result == null ? 0.0 : (Double) result;
    }
    
    // 19. Display the maximum marks scored
    public double getMaxMarks() {
        Object result = entityManager.createQuery("SELECT MAX(s.marks) FROM StudentData s")
                .getSingleResult();
        return result == null ? 0.0 : (Double) result;
    }
    
    // 20. Count how many students belong to each department
    public List<Object[]> getStudentCountByDepartment() {
        return entityManager.createQuery("SELECT s.department, COUNT(s) FROM StudentData s GROUP BY s.department")
                .getResultList();
    }
    
    // Helper method to add sample data
    public void addSampleData() {
        entityManager.getTransaction().begin();
        
        StudentData s1 = new StudentData("Alice Johnson", 21, "Computer Science", "Bangalore", 
                                         85.5, "Female", LocalDate.of(2023, 2, 15));
        StudentData s2 = new StudentData("Bob Smith", 22, "Electronics", "Delhi", 
                                         72.0, "Male", LocalDate.of(2022, 11, 10));
        StudentData s3 = new StudentData("Charlie Brown", 20, "Computer Science", "Bangalore", 
                                         92.5, "Male", LocalDate.of(2023, 3, 20));
        StudentData s4 = new StudentData("Diana Prince", 23, "Mathematics", "Mumbai", 
                                         65.0, "Female", LocalDate.of(2022, 9, 5));
        StudentData s5 = new StudentData("Andrew Wilson", 24, "Computer Science", "Chennai", 
                                         78.5, "Male", LocalDate.of(2023, 5, 12));
        
        entityManager.persist(s1);
        entityManager.persist(s2);
        entityManager.persist(s3);
        entityManager.persist(s4);
        entityManager.persist(s5);
        
        entityManager.getTransaction().commit();
        System.out.println("Sample data added successfully!");
    }
}
