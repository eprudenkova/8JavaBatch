package com.syntax.class15;

public class SubStringMethod {
    public static void main(String[] args) {
        String name = "0123456789abc";
//      will ignore everything before the index 5 (include)
        System.out.println(name.substring(5));//56789abc
        System.out.println(name.substring(8));//89abc
//      System.out.println(name.substring(-1));//StringIndexOutOfBoundsException

        System.out.println(name.substring(5,10));//56789
        System.out.println(name.substring(2,3)+" "+name.substring(7,8));//2 7


    }
}
