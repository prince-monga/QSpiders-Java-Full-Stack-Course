package com.assinment.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateEmployeeTable {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String sql = "CREATE TABLE employee (" +
                         "id INT PRIMARY KEY," +
                         "name VARCHAR(50)," +
                         "salary INT," +
                         "department VARCHAR(50)," +
                         "city VARCHAR(50))";

            statement.executeUpdate(sql);
            System.out.println("Employee Table Created");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
