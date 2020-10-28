package com.syntax.class13;

public class CarObject {
    public static void main(String[] args) {
        //		build individual objects
        CarClass car1 = new CarClass();// object of the Car type // car1 variable
        car1.numberOfDoors=4;
        car1.color="black";
        car1.size=4;
        car1.make="BMW";
        car1.model="i8";

        CarClass car2 = new CarClass();// object of the Car type // car2 variable
        car2.numberOfDoors=2;
        car2.color="blue";
        car2.size=2;
        car2.make="Lamborghini";
        car2.model="Gallardo";



        System.out.println("car1.make "+car1.make);
        System.out.println("car2.make "+car2.make);
    }
}
