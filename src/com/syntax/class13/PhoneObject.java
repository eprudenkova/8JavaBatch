package com.syntax.class13;

public class PhoneObject {
    public static void main(String[] args) {
        PhoneClass phone1 = new PhoneClass();
        phone1.brand = "iPhone";
        phone1.color = "black";
        phone1.call(11111);
        phone1.text("Hello!");
        phone1.pics();

        PhoneClass phone2 =new PhoneClass();
        phone2.brand = "Samsung";
        phone2.color = "black";
        phone2.call(22222);
        phone2.text("Hi!");
        phone2.pics();
    }
}
