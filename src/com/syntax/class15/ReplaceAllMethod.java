package com.syntax.class15;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String name = "123ABCabc+++";
        System.out.println(name.replaceAll("[0-9]",""));//ABCabc+++
        System.out.println(name.replaceAll("[a-z]",""));//123ABC+++
        System.out.println(name.replaceAll("[a-z A-Z]",""));//123+++
        System.out.println(name.replaceAll("[^A-Za-z0-9]",""));//123ABCabc
        System.out.println(name.replaceAll("\\s+",""));//???

    }
}
