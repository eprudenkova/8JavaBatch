package com.syntax.class29;

public class Person {
    private String name;
    private String ssnNumber;
    private int age;
    private double taxPaid;//private

    Person(String name, String ssnNumber, int age, double taxPaid) {
        this.name = name;
        this.ssnNumber = ssnNumber;
        this.age = age;
        this.taxPaid = taxPaid;
    }

    public void setTaxPaid(String ssnNumber, double taxPaid) {
        if (this.ssnNumber.equals(ssnNumber)) {
            if (taxPaid > 0) {
                this.taxPaid = taxPaid;
            } else {
                System.out.println("Can not be negative");
            }
        } else {
            System.out.println("Wrong SSN");
        }
    }

    double getTaxPaid(String ssnNumber) {
        if (this.ssnNumber.equals(ssnNumber)) {
            return taxPaid;
        } else {
            return -1;
        }
    }
}
