package com.jsp;

public class Main {

    public static void main(String[] args) {

        /* ================= PERSON ================= */
        PersonSaveData personDao = new PersonSaveData();
        PersonData p = new PersonData(1, "Prince", 21, "22-12-04");
        personDao.save(p);

        PersonData personFind = personDao.find(1);
        System.out.println("Person Name: " + personFind.getName());

        personDao.updateName(1, "Prince Monga");


        /* ================= STUDENT ================= */
        StudentSaveData studentDao = new StudentSaveData();
        StudentData s = new StudentData(1, "Rahul", 21, "BCA", 45000);
        studentDao.save(s);

        StudentData studentFind = studentDao.find(1);
        System.out.println("Student Name: " + studentFind.getName());

        studentDao.updateName(1, "Aman");


        /* ================= CUSTOMER ================= */
        CustomerSaveData customerDao = new CustomerSaveData();
        CustomerData c = new CustomerData(1, "Rohit", "rohit@gmail.com", 9876543210L, "Delhi");
        customerDao.save(c);

        CustomerData customerFind = customerDao.find(1);
        System.out.println("Customer Name: " + customerFind.getName());

        customerDao.updateCity(1, "Mumbai");
        customerDao.delete(1);


        /* ================= EMPLOYEE ================= */
        EmployeeSaveData employeeDao = new EmployeeSaveData();
        EmployeeData e = new EmployeeData(1, "Vikram", "Developer", 55000, "IT");
        employeeDao.save(e);

        EmployeeData employeeFind = employeeDao.find(1);
        System.out.println("Employee Name: " + employeeFind.getName());

        employeeDao.updateSalary(1, 60000);
        employeeDao.delete(1);


        /* ================= TEACHER ================= */
        TeacherSaveData teacherDao = new TeacherSaveData();
        TeacherData t = new TeacherData(1, "Anita", "Maths", 55000, 8);
        teacherDao.save(t);

        TeacherData teacherFind = teacherDao.find(1);
        System.out.println("Teacher Name: " + teacherFind.getName());

        teacherDao.updateSubject(1, "Physics");
        teacherDao.delete(1);


        /* ================= PRODUCT ================= */
        ProductSaveData productDao = new ProductSaveData();
        ProductData prod = new ProductData(1, "Laptop", "Electronics", 65000, 5);
        productDao.save(prod);

        ProductData productFind = productDao.find(1);
        System.out.println("Product Name: " + productFind.getName());

        productDao.updatePrice(1, 70000);
        productDao.delete(1);


        /* ================= CLIENT ================= */
        ClientSaveData clientDao = new ClientSaveData();
        ClientData cl = new ClientData(1, "Alex", "TechSoft", "alex@techsoft.com", 9988776655L, "USA");
        clientDao.save(cl);

        ClientData clientFind = clientDao.find(1);
        System.out.println("Client Name: " + clientFind.getName());

        clientDao.updateCompany(1, "NextGenTech");
        clientDao.delete(1);


        /* ================= COMPANY ================= */
        CompanySaveData companyDao = new CompanySaveData();
        CompanyData comp = new CompanyData(1, "Infosys", "Bangalore", "IT Services", 250000, 18.5);
        companyDao.save(comp);

        CompanyData companyFind = companyDao.find(1);
        System.out.println("Company Name: " + companyFind.getName());

        companyDao.updateLocation(1, "Pune");
        companyDao.delete(1);


        /* ================= DEPARTMENT ================= */
        DepartmentSaveData deptDao = new DepartmentSaveData();
        DepartmentData dept = new DepartmentData(1, "IT", "Mr. Sharma", 45, "Block A");
        deptDao.save(dept);

        DepartmentData deptFind = deptDao.find(1);
        System.out.println("Department Name: " + deptFind.getName());

        deptDao.updateHod(1, "Mrs. Verma");
        deptDao.delete(1);
    }
}
