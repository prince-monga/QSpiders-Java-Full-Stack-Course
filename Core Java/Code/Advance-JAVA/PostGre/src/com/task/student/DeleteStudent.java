package com.task.student;

import java.sql.*;

public class DeleteStudent {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/student","postgres","root");

            Statement st = con.createStatement();
            st.executeUpdate("DELETE FROM studentdata WHERE id=2");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
