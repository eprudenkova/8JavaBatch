package com.syntax.class30;

public class BoxingUnboxing {
    public static void main(String[] args) {
//      Benefit - we can call methods with primitive
//      we can convert any type ti type its supported

        Integer nonPrimitive = 10;//AutoBoxing, putting non-primitives into Object

        Integer integer = new Integer(10);//Boxing - long way to create obj
        String string = new String("Anna");//Boxing
        String string2 = "Anna";//AutoBoxing
        System.out.println(string);//Anna
        System.out.println(string2);//Anna

        int primitiveInt = nonPrimitive;//AutoUnboxing

        int number = integer.intValue();//Unboxing





    }
}
