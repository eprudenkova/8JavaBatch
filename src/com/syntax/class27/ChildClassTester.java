package com.syntax.class27;

public class ChildClassTester {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.printInfo();
        childClass.printName();
        childClass.printAddress();
        childClass.printNameAndAddress();

//      MyInterface.name = "Anna";//fields can not be reassign as they are always final

        MyInterface myInterface = new ChildClass();
        myInterface.printInfo();
        myInterface.printName();
        myInterface.printAddress();
        myInterface.printNameAndAddress();
    }
}
