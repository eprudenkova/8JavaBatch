package com.syntax.class29;

public class Student implements PrintInfo, PayFee {
    @Override
    public void printName() {
        System.out.println("Student name is ");
    }

    @Override
    public void printPhoneNumber() {
        System.out.println("Student Phone Number is ");
    }

    @Override
    public void printAddress() {
        System.out.println("Student address is ");
    }

    @Override
    public void payFee() {
        System.out.println("Student paid ");
    }
}
