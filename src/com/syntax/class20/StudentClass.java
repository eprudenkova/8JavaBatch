package com.syntax.class20;

public class StudentClass {
    /*
1. Write a Student class that have instance variables name and address.
Create a constructor that will initialize those variables.
Print name & address of given student using displayInfo method.
     */
    String name;
    String address;

    StudentClass(String name,String address){
        this.name=name;
        this.address=address;
    }

    void displayInfo(){
        System.out.println(name+" is from "+address);
    }

    public static void main(String[] args) {
        StudentClass student1 = new StudentClass("Anna","New York");
        student1.displayInfo();
        StudentClass student2 = new StudentClass("John","Philadelphia");
        student2.displayInfo();
    }
}
