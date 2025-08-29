package com.uob;

public class Calculator {

    // Bug: divide by zero + unhandled exception
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) { // empty catch block
        }
        return 0;
    }

    // Code Smell: duplicate code
    public int add(int a, int b) {
        int result = a + b;
        int result2 = a + b; // duplicate
        return result;
    }

    // Vulnerability: hardcoded secret
    private String secretKey = "12345-SECRET";
}
