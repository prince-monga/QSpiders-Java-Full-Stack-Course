package com.task.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudent2 {
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
            st.executeUpdate("INSERT INTO studentdata VALUES (2,'Rohit',21)");

            // 5️ Close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
