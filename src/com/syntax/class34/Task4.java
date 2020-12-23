package com.syntax.class34;

//    Create a Map that will store Employee name and salary.
//    Write a logic to retrieve an employee who gets the highest salary.
//    Output should be in the below format John Smith=$100000

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<String, Integer> employeeMap = new LinkedHashMap<>();
        employeeMap.put("Anna", 100000);
        employeeMap.put("Bob", 120000);
        employeeMap.put("Mike", 90000);
        employeeMap.put("John", 120000);
        System.out.println(employeeMap);

        Iterator<Map.Entry<String, Integer>> iterator = employeeMap.entrySet().iterator();

        Map<String, Integer> map = new HashMap<>();

        String name = "";
        int highestSalary = 0;

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            if (next.getValue() > highestSalary) {
                highestSalary = next.getValue();
            }
        }
        for(Map.Entry<String, Integer> originalMap:employeeMap.entrySet()){
            if(originalMap.getValue()==highestSalary){
                map.put(originalMap.getKey(),originalMap.getValue());
            }
        }
        for (Map.Entry<String, Integer> var : map.entrySet()) {
            System.out.println(var.getKey() + "$" + var.getValue());
        }
        // So first loop we are looking for highest salary
        // second we store highest salary in new map
        // third loop we are printing key and value from our highest salary entry
    }
}