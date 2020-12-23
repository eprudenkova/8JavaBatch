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

        System.out.println(hashMap);
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

        System.out.println(linkedHashMap);
//        {Jack=111, Vladimir=222, Maria=333, Denis=444, Daria=555, Jessor=666}

//      TreeMap: It orders its elements based on their key values;
//      it is substantially slower than HashMap.
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Jack",111);
        treeMap.put("Vladimir",222);
        treeMap.put("Maria",333);
        treeMap.put("Denis",444);
        treeMap.put("Daria",555);
        treeMap.put("Jessor",666);

        System.out.println(treeMap);
//        {Daria=555, Denis=444, Jack=111, Jessor=666, Maria=333, Vladimir=222}

//        map.put(111,"Jack");
//        map.put(111,"Vladimir");
//        map.put(111,"Maria");
//        map.put(111,"Denis");
//        map.put(111,"Daria");
//        map.put(111,"Jessor");
//        System.out.println(map);//{111=Jessor}

    }
}
