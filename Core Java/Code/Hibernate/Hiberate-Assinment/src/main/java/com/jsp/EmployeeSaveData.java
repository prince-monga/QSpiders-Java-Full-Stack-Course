package com.jsp;

import javax.persistence.*;

public class EmployeeSaveData {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("java");

    // Insert or Update
    public EmployeeData save(EmployeeData employeeData) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.merge(employeeData);
        et.commit();

        em.close();
        return employeeData;
    }

    // Find by ID
    public EmployeeData find(int id) {

        EntityManager em = emf.createEntityManager();
        EmployeeData employeeData = em.find(EmployeeData.class, id);
        em.close();

        return employeeData;
    }

    // Update Salary
    public EmployeeData updateSalary(int id, double salary) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        EmployeeData employeeData = em.find(EmployeeData.class, id);

        if (employeeData != null) {
            employeeData.setSalary(salary);
        }

        et.commit();
        em.close();

        return employeeData;
    }

    // Delete
    public boolean delete(int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        EmployeeData employeeData = em.find(EmployeeData.class, id);

        if (employeeData != null) {
            em.remove(employeeData);
            et.commit();
            em.close();
            return true;
        }

        et.commit();
        em.close();
        return false;
    }
}
