package com.syntax.class26;

public class VehicleTest {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();//abstract class
//        Car car = new Car();//abstract class
        Vehicle tesla = new Tesla("red", "X", "Tesla");
        tesla.start();
        tesla.drive();
        tesla.brake();
        tesla.stop();
        System.out.println(Vehicle.totalVehicle);

        new Toyota("Blue","Z","toyota");
        System.out.println(Vehicle.totalVehicle);

    }
}
