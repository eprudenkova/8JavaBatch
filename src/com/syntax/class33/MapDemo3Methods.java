package com.syntax.class33;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3Methods {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jack", 111);
        hashMap.put("Vladimir", 222);
        hashMap.put("Maria", 333);
        hashMap.put("Denis", 444);
        hashMap.put("Daria", 555);
        hashMap.put("Jessor", 666);

        System.out.println(hashMap);//{Daria=555, Jessor=666, Vladimir=222, Denis=444, Jack=111, Maria=333}
        hashMap.remove("Denis");
        System.out.println(hashMap);//{Daria=555, Jessor=666, Vladimir=222, Jack=111, Maria=333}

        System.out.println(hashMap.get("Maria"));//333
        System.out.println(hashMap.containsKey("Jack"));//true
        System.out.println(hashMap.containsKey("jack"));//false
        System.out.println(hashMap.containsKey("Sabeen"));//false
        System.out.println(hashMap.containsValue(111));//true
        System.out.println(hashMap.containsValue(444));//false -- remove before
        System.out.println(hashMap.containsValue(777));//false
        System.out.println(hashMap.containsValue("Jack"));//false

        hashMap.clear();//Removes all of the mappings from this map (optional operation).
        System.out.println(hashMap);//{}
        System.out.println(hashMap.isEmpty());//true
    }
}
