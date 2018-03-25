package com.javanese;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel (String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("m3")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    //a method that can return what the current model is
    public String getModel() {
        return this.model;
    }
}
