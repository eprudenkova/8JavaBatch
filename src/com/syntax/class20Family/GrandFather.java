package com.syntax.class20Family;

public class GrandFather {
    /*
     1. Write program for multilevel inheritance where class A inherited by B and class B inherit class by C.
    2. Write program to inherit class A that has method printF which is static and call
    or reuse that method into class B
     */
    String Property;
    double money;

    public void printF() {
        System.out.println("Property from GrandFather: "+Property+". Money from GrandFather: "+money);
    }
}
