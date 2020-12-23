package com.syntax.class36;

import java.util.Scanner;

public class ExeptionDemo2 {

    public static void main(String[] args) {

        System.out.println("-----1-----");


        int[] arr = {10, 20};
        System.out.println("This will execute always");
        try {
            System.out.println(arr[3]);//3
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Please specify correct index");
        }

        System.out.println("May execute or may not execute");
        System.out.println("1000 lines of code");

        System.out.println("-----2-----");

        int[] array = {10, 20};
        System.out.println("This will execute always");
        try {
            System.out.println(array[0]);//
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Please specify correct index");
        }

        System.out.println("May execute or may not execute");
        System.out.println("1000 lines of code");

        System.out.println("-----3-----");

        int[] arr1 = {10, 20};
        System.out.println("This will execute always");
        try {
            System.out.println(arr1[3]);//3
        } catch (ArrayIndexOutOfBoundsException var) {
            System.out.println("Please specify correct index "+var);
        }

        System.out.println("May execute or may not execute");
        System.out.println("1000 lines of code");

        System.out.println("-----4-----");

//        int[] arr2 = {10, 20};
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("This will execute always");
//        try {
//            int i = scanner.nextInt();
//            System.out.println(arr2[i]);//i
//        } catch (ArrayIndexOutOfBoundsException var) {
//            System.out.println("Please specify correct index "+var);
//        }
//
//        System.out.println("May execute or may not execute");
//        System.out.println("1000 lines of code");

    }
}
