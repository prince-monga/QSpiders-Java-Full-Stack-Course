package com.assinment.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateBookTable {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String sql = "CREATE TABLE book (" +
                         "id INT PRIMARY KEY," +
                         "title VARCHAR(100)," +
                         "author VARCHAR(50)," +
                         "price INT," +
                         "category VARCHAR(50))";

            statement.executeUpdate(sql);
            System.out.println("Book Table Created");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
