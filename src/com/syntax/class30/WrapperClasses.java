package com.syntax.class30;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
//        we have 8 primitive types and for each primitive type we have a Wrapper Class
        byte byteNumber = 127;//can store max -128 to 127
        short shortNumber = 32767;//can store numbers from -32768 up to 32767
        int number = 101512;//can store up to 2 billion
        long longNumber = 132445657585005l;
        float floatNumber = 1520.2453f;
        double numberWithDecimalPoint = 10.5;
        char character = 'A';
        boolean flag = true;

        String name = "asghar";
        name.length();//non-primitive can call methods
//        flag.length();//primitive can NOT call methods
        String stringNumber = "10";
//        System.out.println(stringNumber*2);//CE
        int convertedNumber = Integer.parseInt(stringNumber);
        System.out.println(convertedNumber);//10

        Byte nonPrimitiveByteNumber = 127;
        nonPrimitiveByteNumber.toString();

        Short nonPrimitiveShortNumber = 1000;
        Integer nonPrimitiveNumber = 101512;
        Long nonPrimitiveLongNumber = 132445657585005l;
        Float nonPrimitiveFloatNumber = 1520.2453f;
        Double nonPrimitiveNumberWithDecimalPoint = 10.5;
        Character nonPrimitiveCharacter = 'A';
        Boolean nonPrimitiveFlag = true;

        int primitiveInt = 10;
        Integer nonPrimitiveInt = primitiveInt;
        primitiveInt = nonPrimitiveInt;
        System.out.println(nonPrimitiveInt.doubleValue());//return double - 10.0

//        ArrayList<int> integerArrayList = new ArrayList<>();//Collection FW we can not use with primitive data types
        ArrayList<Integer> integerArrayList = new ArrayList<>();//only with object

    }
}
