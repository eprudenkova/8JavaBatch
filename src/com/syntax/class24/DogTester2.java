package com.syntax.class24;

public class DogTester2 {
    public static void main(String[] args) {
//    all 4 methods can be access from dog
//        because type of box and type of object are same no extra cost
        Dog dog = new Dog();//type of box and type of object same - no issues
//        new Dog().appearance();
        dog.appearance();//general dog
        dog.bark();
        dog.eat();
        dog.sleep();


        dog = new Chow(); //will I get runtime error? //up casting
        dog.appearance(); // chow
//        dog.special();
//        dog = new Dog();// if we uncomment this we will get an error if we try this Chow chow = (Chow) dog;
        dog.sleep();//sleep from general dog


        Chow chow = (Chow) dog; // Dog cannot be cast to Chow //down casting
        chow.special();
        chow.hunt();
        chow.appearance();//chow
        chow.eat();
        chow.sleep();
        chow.bark();


    }
}
