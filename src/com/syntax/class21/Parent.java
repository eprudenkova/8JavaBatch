package com.syntax.class21;

public class Parent extends GrandParent{
    Parent(){
        System.out.println("Constructor from Parent");
    }
    Parent(int money){
        super(money);
    }
}
