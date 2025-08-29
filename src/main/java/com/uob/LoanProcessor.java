package com.uob;

import java.util.List;

public class LoanProcessor {

    public void processLoan() {
        // Bug 1: Null pointer
        String clientName = null;
        System.out.println(clientName.length()); // NullPointerException

        // Bug 2: Array index out of bounds
        int[] loanAmounts = {1000, 2000, 3000};
        System.out.println(loanAmounts[5]);

        // Bug 3: Division by zero
        int totalLoan = 10000;
        int numberOfClients = 0;
        int averageLoan = totalLoan / numberOfClients; // ArithmeticException
        System.out.println("Average loan: " + averageLoan);

        // Bug 4: Unchecked generic cast
        Object obj = List.of("loan1", "loan2");
        List<Integer> loans = (List<Integer>) obj; // ClassCastException at runtime
        System.out.println(loans);
    }
}
