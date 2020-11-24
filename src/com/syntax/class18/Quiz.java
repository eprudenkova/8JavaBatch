package com.syntax.class18;

public class Quiz {
    public static void main(String[] args) {

        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

        System.out.println(replace);
    }
}
