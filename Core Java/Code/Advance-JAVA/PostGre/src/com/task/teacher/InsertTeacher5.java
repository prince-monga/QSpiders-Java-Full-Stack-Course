package com.task.teacher;
import java.sql.*;
public class InsertTeacher5 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/student","postgres","root");
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO teacher VALUES (5,'Karan','OS')");
            con.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
}

