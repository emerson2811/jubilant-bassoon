package com.javanese;

public class interest {
    public static void main(String [] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for (int i=0; i<22; i++) {
            System.out.println("Loop " + i + " hello!");

        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
