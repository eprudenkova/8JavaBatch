package com.syntax.class20;

public class ParentChildTester {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printSomething();
        System.out.println("parent object");

        System.out.println();

        Child child = new Child();
        child.printSomething();
        child.differentPrintMethod();
        System.out.println("child object");
    }
}
