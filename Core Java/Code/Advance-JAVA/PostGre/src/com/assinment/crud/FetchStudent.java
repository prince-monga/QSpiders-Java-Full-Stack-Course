package com.assinment.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchStudent {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM studentnew");

            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id") + " | ");
                System.out.print(resultSet.getString("name") + " | ");
                System.out.print(resultSet.getInt("marks") + " | ");
                System.out.print(resultSet.getString("course") + " | ");
                System.out.print(resultSet.getString("city"));
                System.out.println();
            }

            connection.close();
        }catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
