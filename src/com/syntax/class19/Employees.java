package com.syntax.class19;

public class Employees {
//    Constructors:
//    1) Is a special block of code similar to a method that is executed when we create an object of a class.
//    2) The purpose of constructors is to initialize our fields
//    3) They must have the name same as name of the class
//    4) Constructors do not have return types not even void
//    5) We can pass arguments to our constructors just like we do for our methods

//    we use constructors to create variables (and perform some operations)
//    but only if they meet specific conditions

//    When we want to create an object with specific conditions ( specific age, grade etc)
//    automatically we use constructors.
//    We can also control the input of users ( age/ grade etc..) for specific conditions.

    int age;
    String name;
    char grade;

    Employees() {
        System.out.println("I will be called everytime you created an object of this class");
    }

    Employees(int ageValue, String nameValue, char characterValue) {
        System.out.println("I am not a useless constructor I am initializing you fields");

        if (ageValue > 60 || ageValue < 18) {
            System.out.println("You should not be working, please retired or wait to be 18 y.o.");
        } else {
            age = ageValue;
        }

        if (nameValue.length() > 25) {
            System.out.println("Please use shorter name");
        } else {
            name = nameValue;
            grade = characterValue;
        }
    }

    void print() {
        System.out.println("Number " + age + " name " + name + " character " + grade);
    }
}