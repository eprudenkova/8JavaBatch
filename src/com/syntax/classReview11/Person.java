package com.syntax.classReview11;

public abstract class Person {

    String name;

    static final String species = "Homo sapiens";

    Person(String name) {
        this.name = name;
        System.out.println("Person Constructor");

    }

    final void sleep(){
        System.out.println("Sleep in Person");
    }

    abstract void print();// NO body
}

class Employee extends Person {

    String grade;
    String department;

    Employee(String name, String grade, String department) {
        super(name);
        this.grade = grade;
        this.department = department;
        System.out.println("Employee Constructor");

    }

    @Override
    void print() {
        System.out.println(name + " " + grade + " " + department);

    }
}

class Student extends Person{

    String studentID;

    public Student(String name, String stidentID) {
        super(name);//bcs parent first
        this.studentID=stidentID;
        System.out.println("Student Constructor");
    }

    @Override
    void print() {
        System.out.println(name+" "+studentID);
    }
}


