package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo5 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Tea");
        drinks.add("Coffee");
        drinks.add("Milk");
        drinks.add("Soda");
        drinks.add("Vodka");
        drinks.add("Scotch");
        drinks.add("Juce");

        System.out.println(drinks);

        Iterator<String> iterator = drinks.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("Scotch") || next.equals("Vodka")) {
//          if (iterator.next().equals("Scotch") || iterator.next().equals("Vodka")) {//will NOT work this way iterator.next()
                iterator.remove();
            }
        }
        System.out.println(drinks);
    }
}
