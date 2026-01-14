package com.assinment.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertBook {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String sql = "INSERT INTO book VALUES " +
                         "(1,'Java Basics','James Gosling',500,'Programming')," +
                         "(2,'Clean Code','Robert Martin',700,'Software')";

            statement.executeUpdate(sql);
            System.out.println("Book Data Inserted");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
