package com.javabycode.springboot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseLoopExample {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/yourdatabase";
    private static final String USER = "yourusername";
    private static final String PASS = "yourpassword";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            for (int i = 1; i <= 10; i++) {
                String query = "SELECT * FROM your_table WHERE id = ?";
                try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                    pstmt.setInt(1, i);
                    ResultSet rs = pstmt.executeQuery();
                    while (rs.next()) {
                        // Process the result set
                        System.out.println("Data: " + rs.getString("column_name"));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
