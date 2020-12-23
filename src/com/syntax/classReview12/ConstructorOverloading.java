package com.syntax.classReview12;

import java.sql.SQLOutput;

public class ConstructorOverloading {

    //    overloading the constructor
    String name;
    String lastName;
    int age;

    ConstructorOverloading() {
        this.name = "";
        this.lastName = "";
        this.age = 20;
        System.out.println("Default Constructor");
    }

    ConstructorOverloading(String name) {//overloading
        this();
        this.name = name;
        System.out.println("Constructor with name");
    }

    ConstructorOverloading(String name, String lastName) {//overloading
        this(name);
        this.lastName = lastName;
        System.out.println("Constructor with name and lastName");

    }

    ConstructorOverloading(String name, String lastName, int age) {//overloading
        this(name, lastName);
        this.age = age;
        System.out.println("Constructor with name and lastName and age");

    }

    void print(){
        System.out.println(name+" "+lastName+" "+age);
    }

    public static void main(String[] args) {
//        ConstructorOverloading oc1 = new ConstructorOverloading();
        ConstructorOverloading oc2 = new ConstructorOverloading("Anna");
//        ConstructorOverloading oc3 = new ConstructorOverloading("Anna","Brown");
//        ConstructorOverloading oc4 = new ConstructorOverloading("Anna","Brown",30);

        oc2.print();
    }
}

