package com.syntax.classReview5;

public class Repl144 {
    static int maxValue(int [] array){
        int max=array[0];
        for(int i = 0; i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }
}
