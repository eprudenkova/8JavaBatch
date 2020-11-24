package com.syntax.class26;

public abstract class Vehicle {//abstract class
    String color;//instance fields
    static int totalVehicle;//static fields
//    Vehicle(){
//        totalVehicle++;
//        System.out.println("will be called when ever an object of my Child Class will be created using NO argument constructor");
//    }
    Vehicle(String color){//consractor takin field and inisialaizing inctances
        totalVehicle++;
        this.color=color;
        System.out.println("will be called when ever an object of my Child Class will be created using ONE argument constructor");
    }

    public void drive(){//complete methods
        System.out.println("Drive");
    }
    public void stop(){//complete method
        System.out.println("Stop");
    }
    public abstract void start();//abstract method
    public abstract void brake();//abstract method

    public static final void print(){
        System.out.println("Static and final method");
    }
    public final void printInfo(){
        System.out.println("Final method");
    }
}
//can have only one public class in a file
abstract class Car extends Vehicle{//using extends keyword = using inheritance
    String carType;
    Car(String color, String carType){
        super(color);//super() should be first statement in any constructor
        this.carType=carType;
    }

    @Override
    public void brake() {
        System.out.println(carType+" have brakes");
    }
}
class Tesla extends Car{

    String make;

    Tesla(String color, String carType, String make) {
        super(color, carType);
        this.make=make;
    }

    @Override
    public void start() {
        System.out.println("Can drive on autopilot");
    }
    public void display(){
        System.out.println("Color of car is "+color+" car type "+carType+" make "+make);
    }
}
class Toyota extends Car{

    String make;
    public Toyota(String color, String carType, String make) {
        super(color, carType);
        this.make=make;
    }

    @Override
    public void start() {
        System.out.println(make + " can start w/o keys");
    }
}