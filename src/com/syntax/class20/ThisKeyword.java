package com.syntax.class20;

public class ThisKeyword {
    String name;
    int age;
    double salary;
    String education;
    int numberOfKids;

    ThisKeyword(){
        System.out.println("important line");
    }

    ThisKeyword(String name, int age, double salary) {
        this();
        this.name = name;
        this.age = age;
        this.salary = salary;
        System.out.println("I am first constructor if I have 3 fields");
    }

    ThisKeyword(String name, int age, double salary, String education) {
        this(name, age, salary);
        this.education = education;
        System.out.println("I am first constructor if I have 4 fields");
    }

    ThisKeyword(String name, int age, double salary, String education, int numberOfKids) {
        this(name, age, salary, education);
        this.numberOfKids = numberOfKids;
        System.out.println("I am first constructor if I have 5 fields");
    }

    public static void main(String[] args) {
        ThisKeyword person1 = new ThisKeyword("Anna",30,10000.00);
        System.out.println();
        ThisKeyword person2 = new ThisKeyword("Anna",30,100000.00,"Master");
        System.out.println();
        ThisKeyword person3 = new ThisKeyword("Anna",30,100000.00,"Master",2);

    }

}
