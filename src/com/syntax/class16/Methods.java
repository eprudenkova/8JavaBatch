package com.syntax.class16;

public class Methods {
    public static void main(String[] args) {
        System.out.println(addNumbers(10,20));//30
        System.out.println(addNumbers(10,30));//40
        System.out.println(addNumbers(10,40));//50
        System.out.println(addNumbers(10,50));//60

    }
    public static int addNumbers(int num1, int num2){
        return num1+num2;
    }
}
