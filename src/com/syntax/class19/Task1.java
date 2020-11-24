package com.syntax.class19;

public class Task1 {
    /*
    1) Write a program that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.

    2) Write a java program of Class Students that takes students name and 3 subject grades. Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables.

    1) Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.

    2) Write program as a Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

    int age;
    int year;
    int month;
    int day;
    String name;
    char grade;

    Task1() {
        System.out.println("I will be called when NO args are passed to theconstructor");
    }

    Task1(int ageValue, String nameValue, char gradeValue) {
        age = ageValue;
        name = nameValue;
        grade = gradeValue;
        System.out.println("I will be called when 3 args are passed to theconstructor");
    }

    Task1(int ageValue){
        age = ageValue;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
    }
}
