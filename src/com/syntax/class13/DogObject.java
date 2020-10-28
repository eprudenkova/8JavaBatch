package com.syntax.class13;

public class DogObject {
    public static void main(String[] args) {
        DogClass dog1 = new DogClass();
        dog1.name = "Buddy";
        dog1.breed = "Poodle";
        dog1.age = 4;
        dog1.color = "Grey";

        dog1.sitCommand();
        dog1.downCommand();

        DogClass dog2 = new DogClass();
        dog2.name = "Marley";
        dog2.breed = "Labrador";
        dog2.age = 3;
        dog2.color = "Gold";

        dog2.waitCommand();
    }
}
