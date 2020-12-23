package com.syntax.class34;

//    Create the collection that will store single uniques Objects of a String type in which order is preserved.
//    Write a logic to concatenate all string from the collection.

import java.util.LinkedHashSet;

public class Task5 {

    public static String wordsConcat(LinkedHashSet<String> words) {
        String longWord = "";
        for (String word : words) {
            longWord = longWord + word;
        }
        return longWord;
    }

    public static void main(String[] args) {
        LinkedHashSet<String> words = new LinkedHashSet<>();//LinkedHashSet maintains the insertion order.
        words.add("My");
        words.add("name");
        words.add("is");
        words.add("Zhenya");

        System.out.println(words);

        System.out.println(wordsConcat(words));
    }
}
