package com.syntax.classReview11;

public class Constructors {

    int num;
    String name;

    Constructors(){
        System.out.println("Empty constructor");
    }

    Constructors(int num){
        this.num=num;
        System.out.println(num);
    }

    Constructors(String name){
        this.name = name;
        System.out.println(name);
    }

    Constructors(int num, String name){
        this.num=num;
        this.name=name;
        System.out.println(num+" "+name);
    }

    public static void main(String[] args) {
        Constructors c1 = new Constructors();
        Constructors c2 = new Constructors(5);
        Constructors c3 = new Constructors("Anna");
        Constructors c4 = new Constructors(10,"Anna");
    }
}
