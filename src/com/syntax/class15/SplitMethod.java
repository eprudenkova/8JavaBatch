package com.syntax.class15;

public class SplitMethod {
    public static void main(String[] args) {
        String name = "Burju Maria Qasim";
        String [] array = name.split(" ");
        for (String name1:array){
            System.out.println(name1);
        }

        String str = "Burju*Maria*Qasim";
        String [] array1 = str.split("[^A-Za-z]");
        for (String name3:array1){
            System.out.print(name3+" ");
        }
    }
}
