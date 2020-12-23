package com.syntax.class37;



import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args) {//main method is called by the jvm

        Exception exception = new Exception();
        String path = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("code after ");


//         unchecked
        String name = null;
        if(name!=null){
            name.length();
        }

        int[] arr = {10,20};
        int index = 12;
        if(index>=0&&index<arr.length){
            System.out.println(arr[index]);
        }else{
            System.out.println("Please provide correct index");
        }

    }
}
