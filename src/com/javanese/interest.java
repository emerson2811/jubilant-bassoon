package com.javanese;

public class interest {
    public static void main(String [] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for (int i=0; i<22; i++) {
            System.out.println("Loop " + i + " hello!");

        }

        for (int i=8; i<20; i++) {
            System.out.println("48,4000 at " + i + " interest = " + calculateInterest(48400, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));

        }
    {
        int count = 0;
        for(int i = 10; i <50; i++) {
            if(isPrim(i)) {
                count++;
                System.out.println("Number" + i + "is prime");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrim (int n) {

        if(n ==1) {
            return false;

        }

        for(int i=2; 1 <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return false;
    }
}
