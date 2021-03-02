package com.syntax.class33;

//    6. Create a Map that will store Employee name and salary.
//    Write a logic to retrieve an employee who gets the highest salary.
//    Output should be in the below format John Smith = $100000

import java.util.HashMap;
import java.util.Iterator;

public class HW6 {
    public static void main(String[] args) {

        HashMap<String, Double> employeesMap = new HashMap<>();
        employeesMap.put("Anan Black", 100000.0);
        employeesMap.put("Jack White", 95000.0);
        employeesMap.put("Kate Brown", 190000.0);


//        retrieving highest salary
        Iterator<String> iterator = employeesMap.keySet().iterator();
        double max = 0;
        while (iterator.hasNext()) {
            String nextKey = iterator.next();
            Double value = employeesMap.get(nextKey);
            if (value > max) {
                max = value;
            }
        }

//        creating new Map for storing entry with highest salary
        HashMap<String,Double> newMap = new HashMap<>();
        for (String key : employeesMap.keySet()) {
            if (employeesMap.get(key)==max){
                newMap.put(key,employeesMap.get(key));
            }
        }

//        printing data from Map
        for(String key : newMap.keySet()){
            System.out.println(key+" = $"+newMap.get(key));
        }

    }
}
