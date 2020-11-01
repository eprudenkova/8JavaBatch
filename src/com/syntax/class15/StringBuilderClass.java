package com.syntax.class15;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("world");
        String string = "Hello";
        string.concat("world");
        System.out.println(string);//Hello
        System.out.println(stringBuilder);//Helloworld
    }
}
