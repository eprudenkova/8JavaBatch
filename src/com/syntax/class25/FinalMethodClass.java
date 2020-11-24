package com.syntax.class25;

public class FinalMethodClass {
    final double PI = 3.14;

    void calculateAreaOfCircle(double radius) {
        System.out.println("Area of the circle " + (PI * radius * radius));
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }

    final public void method() {
        System.out.println("Hello World");
    }

}
