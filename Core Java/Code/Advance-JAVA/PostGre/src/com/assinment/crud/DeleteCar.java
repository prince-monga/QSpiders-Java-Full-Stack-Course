package com.assinment.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteCar {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/student",
                "postgres",
                "root"
            );

            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM car WHERE id = 2");

            System.out.println("Car Deleted");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}