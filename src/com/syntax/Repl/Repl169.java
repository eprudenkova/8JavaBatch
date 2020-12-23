package com.syntax.Repl;

public class Repl169 {
    public static void main(String[] args) {

        Cat[] cats = {new Cat("Cat"), new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3")};
        for (Cat cat : cats) {
            cat.eat();
            cat.sleep();
        }
    }
}

class Animal {
    String type;

    public Animal(String type) {
        this.type = type;
    }

    void eat() {
        System.out.println(type + " eats");
    }

    void sleep() {
        System.out.println(type + " sleeps");
    }
}

class Cat extends Animal {
    public Cat(String type) {
        super(type);
    }

    @Override
    void sleep() {
        System.out.println(type + " sleeps a lot");
        ;
    }
}

class Kitten1 extends Cat {
    public Kitten1(String type) {
        super(type);
    }

    @Override
    void eat() {
        System.out.println(type + " ets milk");
    }
}

class Kitten2 extends Cat {
    public Kitten2(String type) {
        super(type);
    }

    @Override
    void eat() {
        System.out.println(type + " eats snacks");
    }
}

class Kitten3 extends Cat {
    public Kitten3(String type) {
        super(type);
    }

    @Override
    void eat() {
        System.out.println(type + " eats everything");
    }
}