package com.assinment.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateMobile {
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
                "UPDATE mobile SET price = 75000 WHERE id = 1"
            );

            System.out.println("Mobile Updated");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

