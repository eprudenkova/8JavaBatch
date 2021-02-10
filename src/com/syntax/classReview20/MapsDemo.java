package com.syntax.classReview20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("Eggs", 12.99);
        hashMap.put("Milk", 10.0);
        hashMap.put("Cake", 20.0);
        System.out.println(hashMap);

        //1. Remove > 10.0
        hashMap.entrySet().removeIf(element -> element.getValue()>10);
        System.out.println(hashMap);

        //2. Remove > 10.0
        Iterator<Map.Entry<String, Double>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> element = iterator.next();
            if (element.getValue() > 10.0){
               iterator.remove();
            }
        }
        System.out.println(hashMap);
    }
}
