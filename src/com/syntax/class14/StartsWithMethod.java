package com.syntax.class14;

public class StartsWithMethod {
    public static void main(String[] args) {
        String var = "maybe you can give a real life ";
        System.out.println(var.startsWith("maybe"));//true
        System.out.println(var.startsWith("may"));//true
        System.out.println(var.startsWith("m"));//true
        System.out.println(var.startsWith("naybe"));//false
        System.out.println(var.startsWith("MAYBE"));//false
        System.out.println(var.startsWith("real"));//false
    }
}
