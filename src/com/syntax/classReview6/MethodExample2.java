package com.syntax.classReview6;

public class MethodExample2 {
    public static void main(String[] args) {
        printNTime("Please study",10);
    }

    static void printNTime(String word, int nTimes){
        for(int i = 0; i< nTimes;i++){
            System.out.println(word);
        }
    }
}
