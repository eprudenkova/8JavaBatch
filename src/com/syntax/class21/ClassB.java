package com.syntax.class21;

public class ClassB extends ClassA{
    public static void main(String[] args) {
        ClassA.print();
        ClassB.print();//will not work w/o extends
        print();//will not work w/o extends
    }
}
