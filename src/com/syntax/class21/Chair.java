package com.syntax.class21;

public class Chair extends Furniture {
    String color = "Black";

    Chair(){
        System.out.println("Chair default constractor");
    }

    void printColor() {
        System.out.println(color);//prints color of Chair Class
        System.out.println(super.color);//prints color from Furniture Class
    }

    void color() {
        System.out.println("Chair color ...");
    }

    void height() {
        System.out.println("Chair is 5 ft ...");
    }

    void work() {
        super.color();
        height();
    }

    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.printColor();
        chair.work();
    }
}
