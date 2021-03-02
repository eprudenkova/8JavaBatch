package com.syntax.class34;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class OutputFiles {
    public static void main(String[] args) throws IOException {

        String path = "/Users/evgeniya/eclipse-workspace/8JavaBatch/src/com/syntax/class34/Credentials1.properties";

//        connection to write the data to file
        FileOutputStream fileOutputStream = new FileOutputStream(path);

//        creating an object
        Properties properties = new Properties();

//        setting the property
        properties.setProperty("phoneNumber", "11111");

//        storing the data
        properties.store(fileOutputStream, "Changing the number");
    }
}
