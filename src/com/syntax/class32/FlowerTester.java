package com.syntax.class32;

import java.util.ArrayList;

public class FlowerTester{

    public static void main(String[] args) {
        ArrayList<Flower> flowerArrayList = new ArrayList<>();
        flowerArrayList.add(new Rose("Rose", "Red"));
        flowerArrayList.add(new Tulip("Tulip", "White"));
        flowerArrayList.add(new Sunflower("Sunflower", "Yellow"));

        for(Flower flower: flowerArrayList){
            System.out.println("Type "+flower.type+" color "+flower.color);
            flower.bloom();
            System.out.println();
        }
    }
}
