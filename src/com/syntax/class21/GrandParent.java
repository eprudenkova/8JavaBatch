package com.syntax.class21;

public class GrandParent {
    int money;
    GrandParent(){
        System.out.println("Constructor from GrandParent");
    }
    GrandParent(int money){
        this.money=money;
        System.out.println("Constructor from grandParent to initialize money");
    }
    void print(){
        System.out.println("I have this money "+money);
    }
}
