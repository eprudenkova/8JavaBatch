package com.syntax.class20;

public class Task {
    /*
    3) Write a program  that will have 4 different access levels of constructors
    and create 3 objects of this class:
    1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package and observe result.
     */

    String name;
    int age;
    double salary;

//  constructor 1,2,3: can not be same data types in parameters
    private Task(String name) {
//       private constructor - I can only create objects of my class from the same class
        this.name = name;
        System.out.println("Private constructor is called");
    }

    Task(int age, char c) {
//        default
        this.age = age;
        System.out.println("Default constructor is called");


    }

    public Task(double salary) {
//        public
        this.salary = salary;
        System.out.println("Public constructor is called");

    }

    public static void main(String[] args) {
//      Task task1 = new Task();//CE as now Java will not create the default constructor
        Task task1 = new Task("marta");
        System.out.println(task1.name);
        System.out.println(task1.age);
        System.out.println(task1.salary);

        Task task2 = new Task(12);
        System.out.println(task2.name);
        System.out.println(task2.age);
        System.out.println(task2.salary);

        Task task3 = new Task(120000.00);
        System.out.println(task3.name);
        System.out.println(task3.age);
        System.out.println(task3.salary);


    }


}
