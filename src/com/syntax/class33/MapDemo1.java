package com.syntax.class33;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();//HashMap -- no loss of methods
//      in this <> we tell what type we will be storing in the map, type of keys and type of values
        map.put(111,"Jack");
        map.put(222,"Vladimir");
        map.put(333,"Maria");
        map.put(444,"Denis");
        map.put(555,"Daria");
        map.put(666,"Jessor");
        System.out.println(map.get(666));
        System.out.println(map);
//      only one value will be store in the map, bcs we are providing the same key again and again
    }
}
