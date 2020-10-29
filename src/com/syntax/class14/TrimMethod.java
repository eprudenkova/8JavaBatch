package com.syntax.class14;

public class TrimMethod {
    public static void main(String[] args) {
//      remove spaces before and after
        String var = "     Moneer is confused    ";
        System.out.println(var.trim());//"Moneer is confused"
        System.out.println(var);//"     Moneer is confused    "
    }
}
