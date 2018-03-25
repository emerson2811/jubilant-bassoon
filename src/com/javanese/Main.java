package com.javanese;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car ford = new Car();
        System.out.println("Model is" + porsche.getModel());
        porsche.setModel("Carerra");
        System.out.println("Model is " + porsche.getModel());
//	    int value = 3;
//	        if(value == 1) {
//                System.out.println("Value was 1");
//
//            } else if (value == 2); {
//                System.out.println("Value was 2");
//            } else {
//                System.out.println("Was not 1 or 2");
//        }

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
                System.out.println("Value was 3");
                break;

            case 4: case 5: case 6:
                System.out.println("Was a 4, 5, or 6");
                System.out.println("Actually, it was a " + switchValue);
        }

//        String month = "January";
//
//        switch (month.toLowerCase()) {
//            case "january":
//                System.out.println("Value of swichValueChar was A");
//                break;
//
//            case "february":
//                System.out.println("Value of swichValueChar was B");
//                break;
//
//            case "march":
//                System.out.println("Value of it was C");
//                break;
//
//            default:
//                System.out.println("Could not find A, B or C");
//                break;

        }

    }

