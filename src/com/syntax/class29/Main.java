package com.syntax.class29;

public class Main {
    public static void main(String[] args) {
        PrintInfo printInfo = new Student();
        printInfo.printName();
        printInfo.printPhoneNumber();
        printInfo.printAddress();
//        printInfo.payFee();

        PrintInfo printInfo1 = new Employee();//error bcs Employee class has not implemented the interface
        printInfo1.printName();
        printInfo1.printPhoneNumber();
        printInfo1.printAddress();

        Student printInfo3 = new Student();
        printInfo3.payFee();//only if the type of variable printInfo is Student, not PrintInfo bcs it has not this method payFee.
    }
}
