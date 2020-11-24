package com.syntax.class26;

 /*
    Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile
    that will provide specific implementation of open behaviour.
    Example: to open .java file we need notepad++ or sublime text,
    to open .doc file we need Microsoft word to be installed etc
     */

public abstract class File {

    public abstract void open();
    public void edit(){}
    public void close(){}
}

class JavaFile extends File{

    @Override
    public void open() {
        System.out.println("to open .java file we need notepad++ or sublime text");
    }
}
class WordFile extends File{
    @Override
    public void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File{
    @Override
    public void open() {
        System.out.println("to open .pdf file we need Adobe Reader to be installed");
    }
}

