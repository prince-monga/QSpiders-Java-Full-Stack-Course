package com.task.teacher;
import java.sql.*;
public class UpdateTeacher2 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/student","postgres","root");
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE teacher SET name='Neha Sharma' WHERE id=2");
            con.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
