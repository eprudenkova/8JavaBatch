package com.syntax.class14;

public class LaptopClass {
//    variables, properties
    String make;
    String model;
    int storage;
    int RAMCapacity;
    String color;
    String processor;
    String GPU;

    void playMovies(){//void just for printing
        System.out.println("Playing movies");
    }
    void browseInternet(){
        System.out.println("Browse Internet");
    }
    void makeVideoCall(String contact){//(arguments)
        System.out.println("Video calling to "+contact);
    }
    public String getModel (){//public - anyone can access this class
        return model;
    }
    int getRAMCapacity(){
        return RAMCapacity*2;
    }
    int upgradeRAM(int newRAMUnit){//(expect from a user)
        return newRAMUnit*RAMCapacity;
    }
}
