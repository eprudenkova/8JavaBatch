package com.syntax.class34;

public class Repl157 {
}

class Main {
    public static void main(String[] args) {
        Child cc1 = new Child();
        Child cc2 = new Child(10);
    }
}

class Parent {

    int number;

    Parent() {
        System.out.println("Parent Constructor without argument");
    }
    Parent(int number) {
        this.number=number;
        System.out.println(number);
    }

}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor without argument");
    }

    public Child(int number) {
        super(number);
    }
}

