package com.syntax.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo7Remove {
    public static void main(String[] args) {

        HashMap<String, Double> storeItemsDay1 = new HashMap<>();
        storeItemsDay1.put("Milk", 3.20);
        storeItemsDay1.put("Bread", 0.90);
        storeItemsDay1.put("Cake", 40.00);
        storeItemsDay1.put("Diaper", 39.90);
        storeItemsDay1.put("Eggs", 4.90);

        HashMap<String, Double> storeItemsDay2 = new HashMap<>();
        storeItemsDay2.put("Beer", 12.00);
        storeItemsDay2.put("Coffee", 3.70);
        storeItemsDay2.put("Snack", 5.00);

//        System.out.println(storeItemsDay2.get(null));//null
//        System.out.println(storeItemsDay2.get("lion"));//null
//        if you pass a key and there is no such key in the Map it will return null

//        combine 2 Maps
        storeItemsDay2.putAll(storeItemsDay1);

        Iterator<Map.Entry<String, Double>> iterator = storeItemsDay2.entrySet().iterator();
        Double sum = 0.0;
        System.out.println(storeItemsDay2.size());//8

        while (iterator.hasNext()) {
            Map.Entry<String, Double> next = iterator.next();
            if (next.getKey().equals("Beer")) {
                iterator.remove();
            } else {
                sum += next.getValue();
            }
        }
        System.out.println("Total sum "+sum);
        System.out.println(storeItemsDay2.size());//7
    }
}
