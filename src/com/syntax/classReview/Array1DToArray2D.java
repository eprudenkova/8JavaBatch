package com.syntax.classReview;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Array1DToArray2D {
//    how can u change a 1D array of string in 2D array of chars
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] strArr= new String [4];
        for(int i=0; i<strArr.length;i++){
            System.out.println("Enter a word: ");
                    strArr[i]=scan.next();
            char[][] charArr = new char[strArr.length][strArr[i].length()];
                charArr[i]=strArr[i].toCharArray();

                for(char[] chr:charArr){
                    for(char ch:chr){
                        System.out.print(ch+" ");
                    }
                    System.out.println();
                }
            }
        }
}
