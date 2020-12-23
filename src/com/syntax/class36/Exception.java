package com.syntax.class36;

import sun.lwawt.macosx.CSystemTray;

public class Exception {
    public static void main(String[] args) {
        System.out.println("Important line of code");
        System.out.println("Normal line of code");

        try {
            System.out.println(10 / 0);//Exception.java:9 not print
        }catch (java.lang.Exception e){
            System.out.println("Can not divide by zero");//print
        }

        try {
            System.out.println(10 / 5);//no problem
        }catch (java.lang.Exception e){
            System.out.println("Can not divide by zero");//not print
        }
        System.out.println("Important line of code");

    }
}
