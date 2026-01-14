package com.assinment.crud;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertCar {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String sql = "INSERT INTO car VALUES " +
                         "(1,'Mahindra','Thar',1500000,'Diesel')," +
                         "(2,'Hyundai','Creta',1200000,'Petrol')";

            statement.executeUpdate(sql);
            System.out.println("Car Data Inserted");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
