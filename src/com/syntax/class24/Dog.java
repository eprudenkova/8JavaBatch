package com.syntax.class24;

public class Dog {
    void bark(){
        System.out.println("Bark");
    }
    void sleep(){
        System.out.println("Sleep");
    }
    void eat(){
        System.out.println("Eat");
    }
    void appearance(){
        System.out.println("I am general dog class");
    }
}
class Cockapoo extends Dog{
    void appearance(){
        System.out.println("I have long hairs");
    }
    void sleep(){
        System.out.println("I sleep 16 hours a day");
    }
}
class Chow extends Dog{

    void appearance(){
        System.out.println("I am Chow");
    }
    void special(){
        System.out.println("I love kids");
    }
    void hunt(){
        System.out.println("Hunt squearrals");
        System.out.println("-------------SUPER KeyWord Explanation-----------");
        super.appearance();
        System.out.println("-------------SUPER KeyWord Explanation-----------");

    }

}
