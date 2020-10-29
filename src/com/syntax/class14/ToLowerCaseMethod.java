package com.syntax.class14;

public class ToLowerCaseMethod {
    public static void main(String[] args) {
        String name = "Ali Kursun";
        System.out.println(name.toLowerCase());//ali kursun
        name = "ali kursun";
        System.out.println(name.toLowerCase());//ali kursun
        name = "ALI KURSUN";
        System.out.println(name.toLowerCase());//ali kursun
//      previous method will not change the original variable
        System.out.println(name);//ALI KURSUN

        String name2 = name.toLowerCase();
        System.out.println();
        System.out.println(name);//ALI KURSUN
        System.out.println(name2);//ali kursun
    }
}
