package com.syntax.Repl;

public class Repl172 {

    public static final String methodReverse(String name){
        String newWord="";
        for(int i=name.length()-1;i>=0;i--){
            newWord+=name.charAt(i);
        }
        return newWord;
    }
    public static void main(String[] args) {
        System.out.println(methodReverse("hello"));
    }
}