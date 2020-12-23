package com.syntax.class30;

public class WrapperClasses {
    public static void main(String[] args) {
//        we have 8 primitive types and for each primitive type we have a Wrapper Class
        byte byteNumber = 127;//can store max -128 to 127
        short shortNumber = 1000;//can store numbers from 32768 up to 32767
        int number = 101512;//can store up to 2 billion
        long longNumber = 132445657585005l;
        float floatNumber = 1520.2453f;
        double numberWithDecimalPoint = 10.5;
        char character = 'A';
        boolean flag = true;

        String name = "asghar";
        String stringNumber = "10";
//        System.out.println(stringNumber*2);//CE
        int convertedNumber = Integer.parseInt(stringNumber);
        System.out.println(convertedNumber);

        Byte nonPrimitiveByteNumber = 127;
        Short nonPrimitiveShortNumber = 1000;
        Integer nonPrimitiveNumber = 101512;
        Long nonPrimitiveLongNumber = 132445657585005l;
        Float nonPrimitiveFloatNumber = 1520.2453f;
        Double nonPrimitiveNumberWithDecimalPoint = 10.5;
        Character nonPrimitiveCharacter = 'A';
        Boolean nonPrimitiveFlag = true;
    }
}
