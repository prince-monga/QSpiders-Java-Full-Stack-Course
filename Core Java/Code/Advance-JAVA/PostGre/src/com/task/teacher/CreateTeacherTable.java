package com.task.teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTeacherTable {
    public static void main(String[] args) {
        try {
            // 1️ Load PostgreSQL Driver
            Class.forName("org.postgresql.Driver");

            // 2️ Create Connection
            String url = "jdbc:postgresql://localhost:5432/student";
            String user = "postgres";
            String password = "root";
            Connection con = DriverManager.getConnection(url, user, password);

            // 3️ Create Statement
            Statement st = con.createStatement();

            // 4️ Execute SQL
            st.execute("CREATE TABLE teacher(id INT, name VARCHAR(50), subject VARCHAR(30))");

            // 5️ Close connection
            con.close();
        }
        catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
