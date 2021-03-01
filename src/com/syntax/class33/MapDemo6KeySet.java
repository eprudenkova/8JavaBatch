package com.syntax.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo6KeySet {
    public static void main(String[] args) {

        HashMap<String, Double> storeItems = new HashMap<>();
        storeItems.put("Milk", 3.20);
        storeItems.put("Bread", 0.99);
        storeItems.put("Cake", 40.00);
        storeItems.put("Diaper", 39.99);
        storeItems.put("Eggs", 4.99);

        Set<String> itemName = storeItems.keySet();//We can store in Set only of Map, because if I know the key I can get a value
        Iterator<String> iterator = itemName.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " " + storeItems.get(key));//get() Returns the value
        }
    }
}
