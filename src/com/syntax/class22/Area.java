package com.syntax.class22;

public class Area {
    /*
Create 1 class in which create a method that will calculate the area (volume) of
Rectangle
Square
Box
     */
    public static void getArea(int sideA, int sideB) {
        System.out.println("The area of rectangle is " + sideA + "*" + sideB + "=" + (sideA * sideB));
    }

    public static void getArea(int sideA) {
        System.out.println("The area of square is " + sideA + "*" + sideA + "=" + (sideA * sideA));
    }

    public static void getArea(int sideA, int sideB, int sideC) {
        System.out.println("The volume of box is " + sideA + "*" + sideB + "*" + sideC + "=" + (sideA * sideB * sideC));
    }

    public static void main(String[] args) {
        Area obj = new Area();
        obj.getArea(2, 3);
        obj.getArea(3);
        obj.getArea(2, 3, 4);
    }
}
