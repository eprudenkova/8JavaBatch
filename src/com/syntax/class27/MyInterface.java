package com.syntax.class27;

public interface MyInterface extends MyInterface2, MyInterface3 {
    //    before Java 8
    String name = "hi";
    void printInfo();

    //    Java 8
    static void printNumber() {
        System.out.println("12345");
    }

    default void printName() {
//        these default are used to support lambdas
    }
}
