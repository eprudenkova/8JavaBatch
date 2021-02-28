package com.syntax.class32;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        LinkedList<Card> cardArrayList = new LinkedList<>();
        cardArrayList.add(new BankOfAmericaCreditCard("Visa"));
        cardArrayList.add(new CityCreditCard("MasterCard"));
        cardArrayList.add(new CapitalOneCreditCard("American Express"));

        for (int i = 0; i < cardArrayList.size(); i++) {
            cardArrayList.get(i).getCreditCard();
            cardArrayList.get(i).cancelCreditCard();
        }

        System.out.println("-----");

        for(Card card:cardArrayList){
            card.getCreditCard();
            card.cancelCreditCard();
        }

        System.out.println("------");

        Iterator<Card> iterator = cardArrayList.iterator();
        while(iterator.hasNext()){
            Card next = iterator.next();
            next.getCreditCard();
            next.cancelCreditCard();
        }
    }
}
