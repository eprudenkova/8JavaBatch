package com.syntax.class34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        //{768511=Printer, 768525=TV, 768551=Phone, 768549=SoundBar, 768532=Laptop}
        //Retrieve all keys and value from a Best Buy map using EntrySet.

        Map<Integer,String> bestBuyElectronic = new HashMap<>();

        bestBuyElectronic.put(768511,"Printer");
        bestBuyElectronic.put(768525,"TV");
        bestBuyElectronic.put(768532,"Laptop");
        bestBuyElectronic.put(768549,"SoundBar");
        bestBuyElectronic.put(768551, "Phone");

        Iterator<Map.Entry<Integer, String>> iterator = bestBuyElectronic.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println("{"+next+"}");
        }
    }
}
