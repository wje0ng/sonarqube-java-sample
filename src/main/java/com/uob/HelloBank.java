package com.uob;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HelloBank {
    // Vulnerability: hardcoded password (security hotspot)
    private static String password = "abc123";

    public static void main(String[] args) {
        System.out.println("Welcome to UOB!");

        // Bug: Null pointer
        String userName = null;
        System.out.println(userName.toLowerCase());

        // Code Smell: duplicate code
        System.out.println("Welcome to UOB!");
        System.out.println("Welcome to UOB!");

        // Vulnerability: SQL Injection risk
        String userInput = "1 OR 1=1"; // imagine input from user
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM users WHERE id = " + userInput; // unsafe concatenation
            stmt.executeQuery(sql);
        } catch (Exception e) {
            // Empty catch block (code smell)
        }

        // Bug: division by zero
        int a = 10;
        int b = 0;
        System.out.println("Divide result: " + (a / b));
    }
}
