package com.syntax.classReview16;

import org.testng.annotations.DataProvider;

interface Driveable {
    boolean FAST_DRIVE = true;
    void drive();
}

class Car implements Driveable{

    @Override
    public void drive() {
        System.out.println("Now we can drive a car");
    }
}

class Bike implements Driveable{

    @Override
    public void drive() {
        System.out.println("Now we can ride a bike");
    }
}
