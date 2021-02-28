package com.syntax.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {

        ArrayList<Insurance> insuranceArrayList = new ArrayList<>();
        insuranceArrayList.add(new Car("CarInsurance","Honda"));
        insuranceArrayList.add(new Pet("PetInsurance","Dog"));
        insuranceArrayList.add(new Health("HealthInsurance"));

        for(int i=0;i<insuranceArrayList.size();i++){
            insuranceArrayList.get(i).getQuote();
            insuranceArrayList.get(i).cancelInsurance();
        }

        System.out.println("-------------");

        for(Insurance insurance:insuranceArrayList){
            insurance.getQuote();
            insurance.cancelInsurance();
        }

        System.out.println("-------------");

        //iterator() will return an object of iterator interface having the elements in this list in proper sequence
        Iterator<Insurance> iterator = insuranceArrayList.iterator();
        while(iterator.hasNext()) {
            Insurance insurance = iterator.next();
            insurance.getQuote();
            insurance.cancelInsurance();
        }
    }
}
