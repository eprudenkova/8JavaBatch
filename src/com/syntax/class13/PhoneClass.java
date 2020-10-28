package com.syntax.class13;

public class PhoneClass {
    String brand;
    String color;

    void call(int number){
        System.out.println("Calling "+number);
    }
    void text(){
        System.out.println(brand +" sending the text");
    }
    void pics (){
        System.out.println(brand +" taking a picture");
    }
}
