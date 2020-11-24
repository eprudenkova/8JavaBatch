package com.syntax.classReview4;

public class Book {
    private String bookName;
    private String author;
    private String ISBN;
    public boolean isAvailable;

    public Book(String bookName, String author, String ISBN, boolean isAvailable) {
        System.out.println("Initializing the book "+bookName+" in the constructor");
        this.bookName = bookName;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
