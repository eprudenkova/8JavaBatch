package com.syntax.class32;

//    Create a Card class that will have implemented and unimplemented methods
//    and a constructor that will initializes credit card type.
//    Create 3 subclasses of a Card card.
//    Create 3 objects of different card and store them into LinkedList.
//    Using for loop/advanced for loop/ iterator access all methods of the class.

public abstract class Card {

    String typeCreditCard;

    Card(String typeCreditCard) {
        this.typeCreditCard = typeCreditCard;
    }

    public void getCreditCard() {//unimplemented method
    }

    public void cancelCreditCard() {//implemented method
        System.out.println("You can cancel your credit card");
    }
}

class BankOfAmericaCreditCard extends Card {

    BankOfAmericaCreditCard(String typeCreditCard) {
        super(typeCreditCard);
    }

    @Override
    public void getCreditCard() {
        System.out.println("You will get " + typeCreditCard);
    }

    @Override
    public void cancelCreditCard() {
        System.out.println("Why do you want to cancel your " + typeCreditCard + " credit card?");
    }
}

class CityCreditCard extends Card {

    public CityCreditCard(String typeCreditCard) {
        super(typeCreditCard);
    }

    @Override
    public void getCreditCard() {
        System.out.println("You will get " + typeCreditCard);
    }

    @Override
    public void cancelCreditCard() {
        super.cancelCreditCard();
    }
}

class CapitalOneCreditCard extends Card{

    public CapitalOneCreditCard(String typeCreditCard) {
        super(typeCreditCard);
    }

    @Override
    public void getCreditCard() {
        System.out.println("You will get " + typeCreditCard);
    }

    @Override
    public void cancelCreditCard() {
        super.cancelCreditCard();
    }
}
