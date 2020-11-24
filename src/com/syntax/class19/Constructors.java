package com.syntax.class19;

public class Constructors {
//    Constructors:
//    1) Is a special block of code similar to a method
//    that is executed when we create an object of a class.
//    2) The purpose of constructors is to initialize our fields
//    3) They must have the name same as name of the class
//    4) Constructors do not have return types not even void
//    5) We can pass arguments to our constructors just like we do for our methods

//    similarities:
//    1. both can have parameters
//    2. both can have access modifiers

//    differences:
//    1. as we can use any name for our method  we can not use any name for our constructor
//    they must have the same name as a class
//    2. constructors can not return values as methods can
//    3. constructors are automatically called hen an instance of the class is created.

//    When should we use constructors?
//    When we want to control the initialization for our fields

    int number;
    String name;
    char character;

    Constructors(){

        System.out.println("I will be called everytime you created an object of this class");
    }
    Constructors(int numberValue, String nameValue, char characterValue){
        System.out.println("I am not a useless constructor I am initializing you fields");
        number = numberValue;
        name = nameValue;
        character = characterValue;
    }

    void print() {
        System.out.println("Number " + number + " name " + name + " character " + character);
    }

    public static void main(String[] args) {
        Constructors constructor = new Constructors();
        Constructors constructor2 = new Constructors(100,"Vlad",'A');

//      Constructors
//      constructors name of the variable
//      = assignment
//      new - we want an object
//      Constructors () - this peace of code is called a constructor
        int num;
        System.out.println();

    }
}
