package com.syntax.class19;

public class EmployeeTester {
    public static void main(String[] args) {
        Employees employee1 = new Employees();//here i an mot using const to initialize
        employee1.age = 200;
        employee1.grade = 'M';
        employee1.name = "Davit";
        System.out.println(employee1.age);

        Employees employee2 = new Employees(5, "Vlad", 'A');// here i am usong the const to assign our code

    }
}
