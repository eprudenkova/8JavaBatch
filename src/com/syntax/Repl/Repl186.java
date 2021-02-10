package com.syntax.Repl;

import java.util.ArrayList;
import java.util.Iterator;

public class Repl186 {
}
class ArrayList186 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);

        System.out.println(list.get(0));//111
        System.out.println(list.get(2));//333
        System.out.println(list.get(4));//555


//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next % 2 != 0) {
//                System.out.println(next);
//            }
//        }
    }
}


