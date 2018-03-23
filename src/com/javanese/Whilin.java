package com.javanese;

public class Whilin {

    public static void main(String[] args) {
        int count = 0;
        while (count != 6) {
            System.out.println("count value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if(count == 5) {
                break;
            }

            System.out.println("Count value est " + count);
            count++;
        }
    }
}
