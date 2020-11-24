package com.syntax.class21;

public class Child extends Parent{
    Child(){
        System.out.println("Constructor from Child");
    }
    Child (int money){
        super(money);
        System.out.println("Constructor from Child");
    }

    public static void main(String[] args) {
        Child child = new Child(1000);
        child.print();
    }
}
