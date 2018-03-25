package com.javanese;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel (String model) {
        this.model = model;
    }

    //a method that can return what the current model is
    public String getModel() {
        return this.model;
    }
}
