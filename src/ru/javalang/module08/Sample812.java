package ru.javalang.module08;

import java.util.Arrays;

public class Sample812 {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Java",2018,2000);
        books[1] = new Book("Python",2017,1000);
        books[2] = new Book("JavaScript",2016,500);

        Arrays.sort(books);

        for(Book book: books){
            System.out.println(book);
        }
    }
}
