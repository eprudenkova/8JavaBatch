package com.syntax.classReview11;

public class PersonTester {
    public static void main(String[] args) {
        Employee employee = new Employee("John","Master","IT");
        Student student = new Student("Anna","12345");
        employee.print();
        student.print();
        employee.sleep();
        student.sleep();
    }
}
