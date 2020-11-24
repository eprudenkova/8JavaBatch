package com.syntax.classReview4;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        Book book1 = new Book("HarryPotter", "HarryPotter", "JK Rowling", true);
        Book book2 = new Book("Java", "Aladin", "12345", true);


        books[0] = book1;
        books[1] = book2;
//        System.out.println(books[1].getAuthor());

//        Book AccessingTheBookThruOBJ = books[1];
//        System.out.println(AccessingTheBookThruOBJ.getBookName());


        Student[] students = new Student[3];
        Student student1 = new Student("Mooner", "111", 30);
        Student student2 = new Student("Bryan", "222", 35);
        Student student3 = new Student("Mike", "333", 27);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Librarian librarian = new Librarian("Ali", "Ali123");
        Library library = new Library("Syntax", books, students, librarian);


        library.issueBook(book1,student1,librarian);
        library.issueBook(book2,student2,librarian);


    }
}
