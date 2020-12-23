package com.syntax.classReview12;

public class EmployeeTester {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Anna", "Brown", "Automation", 100000);
        Tester tester2 = new Tester("John", "Black", "Automation", 200000);
        Tester tester3 = new Tester("Tom", "White", "Automation", 150000);

        Employee employee = new Employee("Asghar", "Nazir", 500);
        tester1.display();
        tester2.display();
        tester3.display();
        employee.display();


    }
}
