package com.syntax.class33;

//    7. Create a collection that will store single unique Objects of a String type in which order is preserved
//    Write a logic to concatenate all string from the collection

import java.util.LinkedHashSet;

public class HW7 {

    public static void main(String[] args){

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("My");
        linkedHashSet.add(" name");
        linkedHashSet.add(" is");
        linkedHashSet.add(" Zhenya");

        String concat = "";
        for(String object : linkedHashSet){
            concat+=object;
        }
        System.out.println(concat);
    }
}
