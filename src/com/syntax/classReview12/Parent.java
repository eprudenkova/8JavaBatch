package com.syntax.classReview12;

public class Parent {

    protected String name = "John";

    protected void parentPrintMethod() {
        System.out.println(name);
    }
}

class Child extends Parent {
    String name = "Jane";

    public void childPrintMethod() {
        System.out.println(name);//Jane
        System.out.println(super.name);//John
    }
    public void printAll(){
        super.parentPrintMethod();//John
        System.out.println(super.name);//John
        this.childPrintMethod();//Jane John
        System.out.println(this.name);//Jane
    }
}
