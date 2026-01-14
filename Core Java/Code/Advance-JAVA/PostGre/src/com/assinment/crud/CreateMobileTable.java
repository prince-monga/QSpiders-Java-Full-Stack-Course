package com.assinment.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateMobileTable {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String sql = "CREATE TABLE mobile (" +
                         "id INT PRIMARY KEY," +
                         "brand VARCHAR(50)," +
                         "model VARCHAR(50)," +
                         "price INT," +
                         "ram VARCHAR(10))";

            statement.executeUpdate(sql);
            System.out.println("Mobile Table Created");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
