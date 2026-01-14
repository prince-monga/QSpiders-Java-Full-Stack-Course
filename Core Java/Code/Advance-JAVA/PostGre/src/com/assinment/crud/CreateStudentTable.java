package com.assinment.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudentTable {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String sql = "CREATE TABLE studentnew (" +
                         "id INT PRIMARY KEY," +
                         "name VARCHAR(50)," +
                         "marks INT," +
                         "course VARCHAR(50)," +
                         "city VARCHAR(50))";

            statement.executeUpdate(sql);
            System.out.println("Student Table Created");

            connection.close();
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
    }
}

