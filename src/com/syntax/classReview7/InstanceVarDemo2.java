package com.syntax.classReview7;

class Dog {
    String name;
    Dog dog;
    int age;
    double weight;
    boolean isAgressive;

    void printProperties() {
        System.out.println(name + " " + age + " " + weight + " " + isAgressive);
//        System.out.println(dog);//null
    }
}

public class InstanceVarDemo2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

//        System.out.println(dog1.name);//null
//        System.out.println(dog1.age);//0
//        System.out.println(dog1.weight);//0.0
//        System.out.println(dog1.isAgressive);//false

        dog1.name = "Bobby";
        dog1.age = 20;
        dog1.weight = 20.5;
        dog1.isAgressive = true;
        dog1.printProperties();

        dog2.name = "Spanky";
        dog2.age = 10;
        dog2.weight = 5.5;
        dog2.isAgressive = true;
        dog2.printProperties();

        dog3.name = "Jerry";
        dog3.age = 20;
        dog3.weight = 50;
        dog3.isAgressive = false;
        dog3.printProperties();
    }
}
