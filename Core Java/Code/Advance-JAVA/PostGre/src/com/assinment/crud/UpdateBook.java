package com.assinment.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateBook {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/student",
                "postgres",
                "root"
            );

            Statement statement = connection.createStatement();
            statement.executeUpdate(
                "UPDATE book SET price = 800 WHERE id = 2"
            );

            System.out.println("Book Updated");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
