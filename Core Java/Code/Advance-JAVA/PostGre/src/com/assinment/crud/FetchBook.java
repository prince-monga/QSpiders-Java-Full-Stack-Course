package com.assinment.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchBook {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM book");

            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id") + " | ");
                System.out.print(resultSet.getString("title") + " | ");
                System.out.print(resultSet.getString("author") + " | ");
                System.out.print(resultSet.getInt("price") + " | ");
                System.out.print(resultSet.getString("category"));
                System.out.println();
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
