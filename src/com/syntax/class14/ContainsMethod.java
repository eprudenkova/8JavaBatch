package com.syntax.class14;

public class ContainsMethod {
    public static void main(String[] args) {
        String var = "I am at school";
        System.out.println(var.contains("am"));//true
        System.out.println(var.contains("at"));//true
        System.out.println(var.contains("i"));//false
        System.out.println(var.contains(" "));//true


    }
}
