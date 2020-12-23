package com.syntax.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insuranceArrayList = new ArrayList<>();
        insuranceArrayList.add(new Car("Car"));
        insuranceArrayList.add(new Pet("Pet"));
        insuranceArrayList.add(new Health("Health"));

        for(int i=0;i<insuranceArrayList.size();i++){
            insuranceArrayList.get(i).getQuote();
            insuranceArrayList.get(i).cancelInsurance();
            System.out.println();
        }

        System.out.println();

        for(Insurance insurance:insuranceArrayList){
            System.out.println("Insurance Type: "+insurance.insuranceName);
            insurance.getQuote();
            insurance.cancelInsurance();
            System.out.println();
        }

        System.out.println();

        Iterator<Insurance> iterator = insuranceArrayList.iterator();
        while(iterator.hasNext()) {
            Insurance insurance = iterator.next();
            insurance.getQuote();
            insurance.cancelInsurance();
            System.out.println();
        }
    }
}
