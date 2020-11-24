package com.syntax.classReview;

import java.util.Scanner;

public class ArrayRecap {
    public static void main(String[] args) {
//        Array is container --> size fixed and data type must be same
//        1. declare and initialize at the same time
        int[] intArr = {3, 5, 7, 1, 15};

//        2. declare first and then assign values
        int[][] intArr1 = new int[2][3];
        intArr1[0][0] = 23;
        intArr1[0][1] = 12;
        intArr1[0][2] = 23;

        intArr1[1][0] = 5;
        intArr1[1][1] = -6;
        intArr1[1][2] = 3;

//        let's fine the sum of all values in our array
        int sum = 0;

        for (int i = 0; i < intArr1.length; i++) {//length for rows; outer loop
            for (int j = 0; j < intArr1[i].length; j++) {//length for columns; inner loop
                sum += intArr1[i][j];
            }

        }
        System.out.println(sum);

        String[][][] arr3d = new String[2][2][3];
//        2 floor
//        2 apartments in each floor
//        3 rooms in each apartments

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr3d.length; i++) {
            for (int j = 0; j < arr3d[i].length; j++) {
                for (int z = 0; z < arr3d[i][j].length; z++){
                    System.out.println("Please enter a name");
                    arr3d[i][j][z]=scan.nextLine();
                }
            }
        }
        for (String[][]arr2d:arr3d){
            for(String [] arr1d:arr2d){
                for(String arr:arr1d){
                    System.out.print(arr+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
