package com.syntax.class15;

import java.util.Arrays;

public class HW {
    public static void main(String[] args) {
        /*
        1.How would you reverse a String character by character?
        2.How would you reverse a String word by word?
        3.How would you reverse a String letter by letter in word?
        4.How would you check if String is palindrome or not?
        5.How would you swap 2 strings without a temporary variable?
         */

        String str1 = "Anna";
        String reverse="";
        for(int i =str1.length()-1;i>=0;i--){
           reverse+=str1.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("Is "+str1+" palindrome? "+reverse.equalsIgnoreCase(str1));

        StringBuilder stringBuilder = new StringBuilder("Anna");
        System.out.println(stringBuilder.reverse());


        System.out.println();

        String str2 = "Have a good day";
        String [] array = str2.split(" ");
        for(int j = array.length-1;j>=0;j--){
            System.out.print(array[j]+" ");
        }

        System.out.println();

        String sentence = "Have a good day";
        String [] stringArray = sentence.split(" ");
        System.out.println(Arrays.toString(stringArray));
        for(int a = 0; a<stringArray.length;a++){
            StringBuilder stringBuilder1 = new StringBuilder(stringArray[a]);
//            System.out.println(stringBuilder1);//Have a good day
            stringArray[a] = stringBuilder1.reverse().toString();
//            System.out.println(stringArray[a]);//evaH a doog yad
        }
        System.out.println(Arrays.toString(stringArray));//evaH, a, doog, yad

        System.out.println();

        String str3 = "Hello";
        String str4 = "World";
        str3=str3.concat(str4);//HelloWord
        str4=str3.replaceAll(str4,"");//Hello
        str3=str3.replaceAll(str4,"");//Word
        System.out.println(str3);
        System.out.println(str4);
    }
}
