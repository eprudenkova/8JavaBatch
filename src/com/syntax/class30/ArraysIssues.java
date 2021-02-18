package com.syntax.class30;

import java.util.Arrays;

public class ArraysIssues {
    public static void main(String[] args) {
        String name = "Ali";
        String name1 = "Anna";
        String name3 = "Jack";
//    variables can hold one value at a time,
//    if need to store 1000 values we need to declare 1000 values;

        int initialSize = 3;
        String[] names = new String[initialSize];
//        String[] names = new String[3];// old version
//        String[] names = new String[1000];//one solution - create bigger array than you need
        names[0] = "Ali";
        names[1] = "Anna";
        names[2] = "Jack";
//        names[3] = "Davit"; Array index out of bound as the size of the array was 3
//        we can not store more than 3 elements

//        Arrays are fixed in size we have to provide the size of the array in advance before we can use it

        System.out.println(names.length);//3
        names = expandArray(names);//expand old Array
        names[3] = "Davit";//add Davit
        names[4] = "Marte";//add Davit
        names[5] = "Mike";//add Davit
        System.out.println(names.length);//6
        System.out.println(Arrays.toString(names));//[Ali, Anna, Jack, Davit, null, null]
    }

//        public static String[] expandArray(String [] oldArray){
//        String[] newArray = new String[oldArray.length * 2];
//            newArray[0] = names[0];
//            newArray[1] = names[1];
//            newArray[2] = names[2];
//            newArray[3] = "Danilo";
//            return newArray;
//        }

    public static String[] expandArray(String[] oldArray) {
        String[] newArray = new String[oldArray.length * 2];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }
}
