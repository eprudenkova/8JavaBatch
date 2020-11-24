package com.syntax.class24;

public class DogTester {
    public static void main(String[] args) {
//    all 4 methods can be access from dog
//        because type of box and type of object are same no extra cost
        Dog dog = new Dog();//type of box and type of object same - no issues
        dog.appearance();
        dog.bark();
        dog.eat();
        dog.sleep();
//        type of box and type of object is not same,
//        so we must pay some price, if we are trying to store a parent in a child,
//        we will get an error
//        or if we try to store a child in a parent we will not be able to access all of
//        the additional methods from our child class, this is the cost.
//
        dog = new Chow();//will I get runtime error?
        dog.appearance();
//        dog.special();
//        dog = new Dog();// if we uncomment this we will get an error if we try this Chow chow = (Chow) dog;
        dog.sleep();//sleep
//        We can extract the contents of box/variable/container and
//        we store these contents in the new box but we must follow
//        all of the above rules

        Chow chow = (Chow) dog;//Dog cannot be cast to Chow
        chow.special();
        chow.hunt();

    }
}
