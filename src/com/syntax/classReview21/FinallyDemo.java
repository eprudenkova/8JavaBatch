package com.syntax.classReview21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) {
        String path = "/Users/evgeniya/eclipse-workspace/8JavaBatch/src/com/syntax/classReview21/hrmsData.xlsx";

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            System.out.println(10/0);
            System.out.println("inside the try block");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } finally {
            System.out.println("inside the finally block");//if you have any unhand in try block - finally block will be execute.
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("outside the try block");
    }

    @Override
    //this method is called by GC whenever the instance of your class is destroyed to free up class resources.
    protected void finalize() throws Throwable {
        super.finalize();

    }
}
