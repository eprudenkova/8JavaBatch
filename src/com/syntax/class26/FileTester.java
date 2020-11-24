package com.syntax.class26;

public class FileTester {
    public static void main(String[] args) {
//        File file = new File(); //we can not create obj of abstract class
        File [] allFiles = {new JavaFile(), new WordFile(), new PdfFile()};
        for(File file:allFiles){
            file.open();
            file.edit();//from parent abstract class
            file.close();//from parent abstract class
        }
    }
}
