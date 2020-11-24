package com.syntax.class21;

public class MoneerClass extends ParentClass{

    int money;

    MoneerClass(int money) {
        super(money);
        super.money=10;
    }

    void marry(){
        super.marry();
        System.out.println("Moneer will marry Katrina "+money);
    }

    public static void main(String[] args) {
        MoneerClass moneer = new MoneerClass(1000);
        moneer.marry();
    }
}
