package com.syntax.class14;

public class ConcatMethod {
    public static void main(String[] args) {
        String firstName = "Ebrar";
        String lastName = "Gur";
        String friendName = "Burju";
        String name = null;
        String completeName = firstName.concat(lastName);//add only one
//      completeName = firstName.concat(name);//error //treats a null as a method
        System.out.println(completeName);
        System.out.println(firstName+" "+lastName+" "+friendName);//add as many
        System.out.println(firstName+" "+lastName+" "+friendName+" "+name);//treats a null as a String

    }
}
