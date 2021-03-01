package com.syntax.class33;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();//right side better use HashMap - no loss of methods
//      in this <> we tell what type we will be storing in the map, type of keys and type of values
        map.put(111,"Jack");
        map.put(222,"Vladimir");
        map.put(333,"Maria");
        map.put(444,"Denis");
        map.put(555,"Daria");
        map.put(666,"Jessor");
        System.out.println(map.get(666));//jessor
        System.out.println(map);//{666=Jessor, 555=Daria, 444=Denis, 333=Maria, 222=Vladimir, 111=Jack}


        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(111,"Jack");
        map2.put(111,"Jack");
        map2.put(111,"Jack");
        map2.put(111,"Jack");
        map2.put(111,"Jack");
        map2.put(111,"Marta");
        System.out.println(map2.get(111));//Marta
        System.out.println(map2);//{111=Marta}
//      only one value will be stored in the map, because we are providing the same key again and again
    }
}
