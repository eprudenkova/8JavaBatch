package com.syntax.class13;

public class DogClass {
    String breed;
    String name;
    int age;
    String color;

    void sitCommand(){
        System.out.println(breed+" "+name+" can do sit command");
    }
    void waitCommand(){
        System.out.println(breed+" "+name+" can do wait command");
    }
    void downCommand(){
        System.out.println(breed+" "+name+" can do down command");
    }
}
