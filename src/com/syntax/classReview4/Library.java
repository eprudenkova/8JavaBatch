package com.syntax.classReview4;

import sun.lwawt.macosx.CSystemTray;

public class Library {

    private String name;
    private Book books[];
    private Student[] students;
    private Librarian librarian;

    public Library(String name, Book[] books, Student[] students, Librarian librarian) {
        this.name = name;
        this.books = books;
        this.students = students;
        this.librarian = librarian;
    }

    void issueBook(Book bookVar, Student studentName, Librarian LibrarianName) {
        System.out.println("Checking for the availability of a book inside library");
        for (Book book : books) {
            if (book.getISBN().equals(book.getISBN())) {
                System.out.println("Book found checking if that is available or already issued");
                if (bookVar.isAvailable()) {
                    System.out.println("Book is available checking if student can ave this book");
                    if (studentName.getBooks().length >= 2) {
                        System.out.println("Sorry, your limit has exceeded");
                    } else {
                        System.out.println("Issuing the book");
                    }
                } else {
                    System.out.println("Book is not available");
                }
            } else {
                System.out.println("Book does not exist in the library");
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBook() {
        return books;
    }

    public void setBook(Book[] book) {
        this.books = book;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
}
