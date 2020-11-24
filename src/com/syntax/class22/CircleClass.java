package com.syntax.class22;

public class CircleClass extends ShapeClass{

    CircleClass(double radius){
        super(radius);
    }

    public void calculateArea(){
        double area = 3.14*radius*radius;
        System.out.println(area);
    }

    public static void main(String[] args) {
        CircleClass circle = new CircleClass(1);
        circle.calculateArea();
    }
}
