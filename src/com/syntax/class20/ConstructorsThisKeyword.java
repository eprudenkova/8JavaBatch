package com.syntax.class20;

public class ConstructorsThisKeyword {
    ConstructorsThisKeyword(){
        this(1);
        System.out.println("Hi");
    }
    ConstructorsThisKeyword(int x){
        this(1,2);
        System.out.println("Hello");
    }
    ConstructorsThisKeyword(int x, int y){
        System.out.println("How are you");
    }

    public static void main(String[] args) {
        ConstructorsThisKeyword obj=new ConstructorsThisKeyword();
    }
}

