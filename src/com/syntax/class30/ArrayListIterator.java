package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(100);
        arrayList.add(200);

        Iterator<Integer> iterator = arrayList.iterator();//return an object of the class which has implemented iterator interface
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        while(iterator.hasNext()){
//            Integer next = iterator.next();
//            for(int i =0; i<4; i++){
//                System.out.println(next);
//            }
//        }
    }
}
