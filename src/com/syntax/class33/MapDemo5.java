package com.syntax.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jack", 111);
        hashMap.put("Vladimir", 222);
        hashMap.put("Maria", 333);
        hashMap.put("Denis", 444);
        hashMap.put("Daria", 555);
        hashMap.put("Jessor", 666);

        Set<String> keySet = hashMap.keySet();
        for (String key : keySet) {
            System.out.println(key);//Daria...
            System.out.println(hashMap.get(key));//555...
        }

//        we can not use simple loop
//        for(int i = 0; i<keySet.size();i++){
//            System.out.println(keySet.get(i));
//        }

        Iterator<String> iterator = keySet.iterator();

    }
}
