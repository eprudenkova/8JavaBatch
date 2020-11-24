package com.syntax.class25;

public class Computer {
/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class
and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array.
Loop through each object and execute available methods.
 */

    String brand;
    String color;
    String capacity;
    double price;
    int screenSize;
    double weight;
    boolean isTouchScreen;

    public Computer(String brand, String color, String capacity, double price, int screenSize, double weight, boolean isTouchScreen) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
        this.price = price;
        this.screenSize = screenSize;
        this.weight = weight;
        this.isTouchScreen = isTouchScreen;
    }

    public void getColor() {
        System.out.println("Computer Class Color");

    }
}
class Apple extends Computer{
    public Apple(String brand, String color, String capacity, double price, int screenSize, double weight, boolean isTouchScreen) {
        super(brand, color, capacity, price, screenSize, weight, isTouchScreen);
    }

    @Override
    public void getColor() {
        System.out.println(brand+" has another color");
    }
}
class Lenovo extends Computer{
    public Lenovo(String brand, String color, String capacity, double price, int screenSize, double weight, boolean isTouchScreen) {
        super(brand, color, capacity, price, screenSize, weight, isTouchScreen);
    }

    @Override
    public void getColor() {
        System.out.println(brand+" has just one color");
    }

    public void specialBehavior(){
        System.out.println("Special Behavior");
    }
}


