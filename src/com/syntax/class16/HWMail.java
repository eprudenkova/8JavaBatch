package com.syntax.class16;

public class HWMail {
    public static void main(String[] args) {
        HWMethods task1 = new HWMethods();
        String email = task1.createEmailAsghar("John","Snow","gmail");
        System.out.println(email);

        HWMethods task2 = new HWMethods();
        boolean prime1 = task2.isPrimeAsghar(11);//true
        boolean prime2 = task2.isPrimeAsghar(12);//false
        System.out.println(prime1);
        System.out.println(prime2);

        HWMethods task3 = new HWMethods();
        char grade = task2.getGradeAsghar(55);
        System.out.println(grade);//D


    }
}
