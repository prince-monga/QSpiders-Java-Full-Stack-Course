package com.task.teacher;
import java.sql.*;
public class DeleteTeacher1 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/student","postgres","root");
            Statement st = con.createStatement();
            st.executeUpdate("DELETE FROM teacher WHERE id=1");
            con.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
