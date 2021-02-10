package com.syntax.Repl;

public class Repl173 {
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }

    public static final double avgElements(int[] array){
        double sum = 0;
        double avg = 0;
        for(int i=0; i<array.length;i++){
            sum+=array[i];
        }
        avg=sum/array.length;
        return avg;
    }
}
