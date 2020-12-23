package com.syntax.class37;

public class ExceptionDemo {
    public static void main(String[] args) {

        int [] arr = {0};
        try{
            doCalculations(arr);
        }catch(NullPointerException npe){
            System.out.println("Please do not provide null array");
        }catch(ArithmeticException ae){
            System.out.println("Please do not try to divide by zero");
        }catch(ArrayIndexOutOfBoundsException aib){
            System.out.println("Please use the proper index");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
    public static void doCalculations(int arr[]){
        int[] array = new int[-1];
        System.out.println(arr[2]/arr[3]);
    }
}
