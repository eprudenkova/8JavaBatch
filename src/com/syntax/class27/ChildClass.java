package com.syntax.class27;

public class ChildClass implements MyInterface, MyInterface2 {
    @Override
    public void printInfo() {
        System.out.println("My name is ");
    }

    @Override
    public void printAddress() {
        System.out.println("My addres is ");
    }

    @Override
    public void printNameAndAddress() {
        System.out.println("My name and address are ");
    }
}
