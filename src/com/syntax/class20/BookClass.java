package com.syntax.class20;

public class BookClass {
    /*
    2. Write program as a Book class that will have instance variables and 2 Constructors.
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */

    String name;
    String author;
    double price;

    BookClass(String name,String author){
        this(10.99);
        this.name=name;
        this.author=author;
        System.out.println(name+" "+author);
    }

    BookClass(double price){
        this.price=price;
        System.out.println("price is "+price);
    }

    public static void main(String[] args) {
        BookClass book1 = new BookClass("Harry Potter","J.K. Rowling");
    }
}
