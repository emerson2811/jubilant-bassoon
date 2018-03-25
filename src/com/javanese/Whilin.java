package com.javanese;

public class Whilin {

        public static void main(String[] args) {
            int number = 0;
            int finishNumber = 20;
            int i = 0;

            while (number <= finishNumber) {
                number++;
                if (isEvenNumber(number)) {
                    i++;
                    System.out.println("Even number " + number);
                    System.out.println("Total number of even numbers so far is " + i);
                }
                    else if (i==5) {
                        break;
                    }
                }

                System.out.println("Even number " + number);
            }

        public static boolean isEvenNumber(int number) {
            if((number % 2) == 0) {
                return true;
            } else {
                return false;
            }

            }
//        int count = 6;
//        while (count != 6) {
//            System.out.println("count value is " + count);
//            count++;
//        }

//        count = 1;
//        while (true) {
//            if(count == 5) {
//                break;
//            }
//
//            System.out.println("Count value est " + count);
//            count++;
//        }
//
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }

//        } while (count !=6);
    }

