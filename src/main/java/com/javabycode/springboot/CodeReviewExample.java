package com.javabycode.springboot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CodeReviewExample {

    // Indefinite loop
    public void runIndefiniteLoop() {
        while (true) {
            System.out.println("Running indefinitely...");
        }
    }

    // Issue with DB connection
    public void connectToDatabase() {
        Connection connection = null;
        try {
            // Simulate database connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
            // Perform database operations
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Improper connection handling
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Memory leak
    public void causeMemoryLeak() {
        List<String> list = new ArrayList<>();
        while (true) {
            list.add("Memory leak");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        CodeReviewExample example = new CodeReviewExample();
        // Uncomment one of the following lines to test each issue
        // example.runIndefiniteLoop();
        // example.connectToDatabase();
        // example.causeMemoryLeak();
    }
}