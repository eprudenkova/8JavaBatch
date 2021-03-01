package com.syntax.class33;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
//      HashMap: it makes no guarantees concerning the order of iteration,
//      HashMap doesn’t maintain the insertion order of key elements.
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(111, "Jack");
        hashMap.put(222, "Vladimir");
        hashMap.put(333, "Maria");
        hashMap.put(444, "Denis");
        hashMap.put(555, "Daria");
        hashMap.put(666, "Jessor");

        System.out.println("hashMap "+hashMap);
//        {666=Jessor, 555=Daria, 444=Denis, 333=Maria, 222=Vladimir, 111=Jack}

//      LinkedHashMap: It orders key elements based on the order
//      in which they were inserted into the set (insertion-order).
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Jack",111);
        linkedHashMap.put("Vladimir",222);
        linkedHashMap.put("Maria",333);
        linkedHashMap.put("Denis",444);
        linkedHashMap.put("Daria",555);
        linkedHashMap.put("Jessor",666);

        System.out.println("linkedHashMap(key String) "+linkedHashMap);

        Map<Integer, String> linkedHashMap2 = new LinkedHashMap<>();
        linkedHashMap2.put(111,"Jack");
        linkedHashMap2.put(222,"Vladimir");
        linkedHashMap2.put(333,"Maria");
        linkedHashMap2.put(444,"Denis");
        linkedHashMap2.put(555,"Daria");
        linkedHashMap2.put(666,"Jessor");

        System.out.println("linkedHashMap(key Integer) "+linkedHashMap2);

//      TreeMap: It orders its elements based on their key values;
//      it is substantially slower than HashMap.
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(111,"Jack");
        treeMap.put(555,"Daria");
        treeMap.put(333,"Maria");
        treeMap.put(222,"Vladimir");
        treeMap.put(444,"Denis");
        treeMap.put(666,"Jessor");

        System.out.println("treeMap (key - Integer) "+treeMap);

        Map<String, Integer> treeMap2 = new TreeMap<>();
        treeMap2.put("Jack",111);
        treeMap2.put("Vladimir",222);
        treeMap2.put("Maria",333);
        treeMap2.put("Denis",444);
        treeMap2.put("Daria",555);
        treeMap2.put("Jessor",666);

        System.out.println("treeMap (key - String) "+treeMap2);
    }
}
