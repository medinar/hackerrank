package com.medinar.hackerrank.challenges.java.abstractclasses;

/**
 *
 * @author Rommel Medina
 */
public abstract class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();

}

class MyBook extends Book {

    int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + this.price);
    }

}
