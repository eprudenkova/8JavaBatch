package com.syntax.class15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        /*
        1. Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        2. Create a String that should be combination of letters, numbers and special characters.
        Find out how many alpha characters are there in the String.
        3. You have a String a = ”Is it saturday? Is it raining? Do we have a Java Class today?”
        How would you find out how many sentences are in that String
         */

        String str1 = "Hello word";
        System.out.println(str1 + " --> " + str1.replace(" ", ""));
//        \\s -space
        System.out.println(str1.replaceAll("\\s", ""));


        String str2 = "123ABCabc+++";
        str2 = str2.replaceAll("[^A-Za-z0-9]", "");
        System.out.println("How many alpha characters are there in the String? " + str2.length() + " --> " + str2);

        String a = "Is it Saturday? Is it raining? Do we have a Java Class today?";
        String b = a.replaceAll("[\\sA-Za-z0-9]", "");
        System.out.println(b.length());

        String sentence="Is it saturday? Is it raining? Do we have a Java Class today?";
        String[]array=sentence.split("/?");
        System.out.println(Arrays.toString(array));


    }
}
