package com.assinment.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertMobile {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String sql = "INSERT INTO mobile VALUES " +
                         "(1,'Samsung','S23',70000,'8GB')," +
                         "(2,'Apple','iPhone 14',80000,'6GB')";

            statement.executeUpdate(sql);
            System.out.println("Mobile Data Inserted");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
