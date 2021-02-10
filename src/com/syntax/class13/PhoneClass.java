package com.syntax.class13;

public class PhoneClass {
    String brand;
    String color;

    void call(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void text(String textMessage) {
        System.out.println(brand + " sending the text message "+textMessage);
    }

    void pics() {
        System.out.println(brand + " taking a picture");
    }
}
