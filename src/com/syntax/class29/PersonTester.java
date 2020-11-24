package com.syntax.class29;

public class PersonTester {
    public static void main(String[] args) {
        Person davitObj = new Person("Davit", "123", 30, 30000);
        Person mikeObj = new Person("Mike","111",25,1000);

//        System.out.println(davit.taxPaid);//30000.0//has private taxPaid
//        davit.taxPaid = 0;//has private taxPaid
//        System.out.println(davit.taxPaid);//0.0//has private taxPaid
        davitObj.setTaxPaid("123", -1);//Can not be negative
        davitObj.setTaxPaid("12345", -1);//Wrong SSN
        davitObj.setTaxPaid("123", 1);
        System.out.println(davitObj.getTaxPaid("12345"));//-1.0
        System.out.println(davitObj.getTaxPaid("123"));//1.0

        mikeObj.getTaxPaid("111");


    }
}
