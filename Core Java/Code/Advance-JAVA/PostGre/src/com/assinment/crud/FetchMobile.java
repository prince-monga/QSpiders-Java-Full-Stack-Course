package com.assinment.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchMobile {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM mobile");

            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id") + " | ");
                System.out.print(resultSet.getString("brand") + " | ");
                System.out.print(resultSet.getString("model") + " | ");
                System.out.print(resultSet.getInt("price") + " | ");
                System.out.print(resultSet.getString("ram"));
                System.out.println();
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
