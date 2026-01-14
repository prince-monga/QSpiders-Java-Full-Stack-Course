package com.assinment.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudent {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String sql = "INSERT INTO studentnew VALUES " +
                         "(1,'Rahul',85,'BCA','Delhi')," +
                         "(2,'Amit',90,'BCA','Sirsa')";

            statement.executeUpdate(sql);
            System.out.println("Data Inserted");

            connection.close();
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
