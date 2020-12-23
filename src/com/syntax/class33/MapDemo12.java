package com.syntax.class33;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo12 {
    public static void main(String[] args) {
        Map<String, Double> storeItems = new LinkedHashMap<>();
        storeItems.put("Milk", 3.20);
        storeItems.put("Bread", 0.99);
        storeItems.put("Cake", 40.00);
        storeItems.put("Diaper", 39.99);
        storeItems.put("Eggs", 4.99);

        Collection<Double> values = storeItems.values();
        System.out.println(values);
    }
}
