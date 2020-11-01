package com.syntax.class15;

public class IndexOfMethod {
    public static void main(String[] args) {
        String name = "Mohammed ";//m0o1h2a3m4m5e6d7
        System.out.println(name.indexOf('m'));//4
        System.out.println(name.indexOf('M'));//0
        System.out.println(name.indexOf('e'));//6
        System.out.println(name.indexOf(' '));//8
        System.out.println(name.indexOf('t'));//-1 always
    }
}
