package com.syntax.class29;

public class PersonTester {
    public static void main(String[] args) {
        Person davit = new Person("Davit", "123", 30, 30000);

//        CE cannot access and modify data
//        System.out.println(davit.taxPaid);//30000.0//has private taxPaid
//        davit.taxPaid = 0;//has private taxPaid
//        System.out.println(davit.taxPaid);//0.0//has private taxPaid

        davit.setTaxPaid("123", -1);//output: Can not be negative
        davit.setTaxPaid("wrongSSN", -1);//output: Wrong SSN

        System.out.println(davit.getTaxPaid("wrongSSN"));//-1.0
        System.out.println(davit.getTaxPaid("123"));//30000.0

        Person mike = new Person("Mike","111",25,1000);

        mike.getTaxPaid("111");
    }
}
