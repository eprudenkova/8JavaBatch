package com.syntax.classReview20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

    public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException {//JVM calls main method

        //storing the path of a file in a String variable
        String path = "/Users/evgeniya/eclipse-workspace/8JavaBatch/src/com/syntax/classReview20/Test.properties";
        //creating a connection to file
        FileInputStream fileInputStream = new FileInputStream(path);
        //creating an object
        Properties properties = new Properties();
        //loading the data from file to java program
        //always load the data before you make changes if you want to retain the data from your file
        properties.load(fileInputStream);//

        String username = properties.getProperty("username");
        System.out.println(username);
        String password = properties.getProperty("password");
        System.out.println(password);
        //close
        fileInputStream.close();

        //connection to write the data to file
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        //setting the new property
        properties.setProperty("username","Zhenya");
        properties.setProperty("password","123");
        //storing the data
        properties.store(fileOutputStream,"change username and password");




    }
}
