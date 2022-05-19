package ru.javalang.module06;

public class Book {
    private String title;
    private String author;
    private final int yearPublished;
    public Book(String title, String author, int yearPublished)
    {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    public String getBook()
    {
        return this.title + " " + this.author + " " + this.yearPublished;
    }
}
