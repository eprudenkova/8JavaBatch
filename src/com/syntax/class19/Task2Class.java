package com.syntax.class19;

public class Task2Class {
//    Create a method that will take a String as a parameter and returns reversed String.
//    Method should be available to all classes within your project and accessible by class name.

    public static String returnReversed(String string){//static = accessible by class name
        StringBuilder stringBuilder = new StringBuilder(string);//type StringBuilder
        return stringBuilder.reverse().toString();//toString
    }
}
