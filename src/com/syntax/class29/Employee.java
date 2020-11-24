package com.syntax.class29;

public class Employee implements PrintInfo{
    @Override
    public void printName() {
        System.out.println("Employee name is ");
    }

    @Override
    public void printPhoneNumber() {
        System.out.println("Employee Phone NUmber is ");

    }

    @Override
    public void printAddress() {
        System.out.println("Employee adress is ");

    }
}
