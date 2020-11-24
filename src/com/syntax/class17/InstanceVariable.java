package com.syntax.class17;

public class InstanceVariable {
    public static void main(String[] args) {
        InstanceVariable student1 = new InstanceVariable();
        student1.name = "Qasim";
        student1.age = 30;
        student1.marks = 90;
        student1.numberOfStudents++;
        student1.studentsRegistered();

        InstanceVariable student2 = new InstanceVariable();
        student2.name = "Danilo";
        student2.age = 30;
        student2.marks = 95;
        student2.numberOfStudents++;
        student2.studentsRegistered();

        InstanceVariable student3 = new InstanceVariable();
        student3.name = "Iliya";
        student3.age = 34;
        student3.marks = 99;
        System.out.println(student3.numberOfStudents);
        student3.numberOfStudents++;
        student3.studentsRegistered();

    }

    String name;//instance var
    int age;//ins var
    double marks;//ins var
//  does not matter where declare, because here we are not executing code, just declaring
    static int numberOfStudents=11;


    public void printInfo(){
        System.out.println("Name is "+name+" age is "+age+" marks is "+marks);// ins var
    }

    public void printMarks(){
        System.out.println("marks is "+marks);
    }

    public void studentsRegistered(){
        System.out.println("Total number of student up till now "+numberOfStudents);
    }

}
