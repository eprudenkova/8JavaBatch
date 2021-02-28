package com.syntax.class32;

import java.util.HashMap;
import java.util.Map;

public class MapDemo4 {
    public static void main(String[] args) {

        Map<Integer, String> stringMap = new HashMap<>();

        stringMap.put(111, "Sabeen loves PTI");
        stringMap.put(222, "PTI destroyed Pakistan economy");
        System.out.println(stringMap.containsKey(222));//true
        System.out.println(stringMap.containsValue("PTI destroyed Pakistan economy"));//true
    }
}
