package com.syntax.classReview16;

import javafx.scene.transform.ShearBuilder;

public abstract class SoundAnimal {

    public abstract void animalSound();
    public void sleep(){
        System.out.println("Sleeping zzzZZZzzz");
    }

}
class Horse extends SoundAnimal{

    @Override
    public void animalSound() {
        System.out.println("neigh neigh iiihhhaaa igogo");
    }
}
