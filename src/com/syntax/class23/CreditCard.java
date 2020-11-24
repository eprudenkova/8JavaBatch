package com.syntax.class23;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class CreditCard {
//    Create a class CreditCard and define variable balance and interest.
//    Create an instance method that will calculate interest based on the given balance.
//    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//    Call the method by creating an object of each of the three classes.

    double balance;

    public CreditCard(double balance) {
        this.balance = balance;
    }

    void getInterest() {//inside class and not a static = instance method
        System.out.println("The interest from the balance " + balance + " is equal " + balance * 0.1);
    }

    public static void print() {
        System.out.println("parent...");//dopisat
    }

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1000);
        Visa visa = new Visa(1000);
        AX ax = new AX(1000);
        creditCard.getInterest();
        visa.getInterest();
        ax.getInterest();
        CreditCard.print();
        Visa.print();
        AX.print();
    }
}

class Visa extends CreditCard {
    Visa(double balance) {
        super(balance);
    }

    public static void print() {
        System.out.println("I am overridden method in child class");
    }
}

class AX extends CreditCard {
    AX(double balance) {
        super(balance);
    }

    void getInterest() {//inside class and not a static = instance method
        System.out.println("The interest AX from the balance " + balance + " is equal " + balance * 0.2);
    }
}
