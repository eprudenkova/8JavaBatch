package com.syntax.classReview20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileDemo {
    public static void main(String[] args) throws IOException {
        String path = "/Users/evgeniya/eclipse-workspace/8JavaBatch/src/com/syntax/classReview20/Test.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write("New line to my file");
        fileWriter.close();

        scanner.close();
    }
}
