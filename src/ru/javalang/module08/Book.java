package ru.javalang.module08;

import java.util.Date;

public class Book implements Comparable, Cloneable{
    private String title;
    private int yearPublished;
    private int price;

    public Book() {}
    public Book(String title, int yearPublished, int price){
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    public String getTitle() { return title;    }
    public int getYearPublished() { return yearPublished; }
    public int getPrice(){ return price;}
    public void printReport(){System.out.println("Название: "+title+
            " год издания: "+ yearPublished +" цена: "+price); }

    public int compareTo(Object object) {
        Book book=null;
        if(object instanceof Book)
            book = (Book)object;
        else {/*возбуждаем исключение*/}
        if ( price < book.price )
            return -1;
        else if ( price > book.price )
            return 1;
        else return 0;
    }
    public Object clone() {
        Book book = new Book();
        book.title = title;
        book.yearPublished = yearPublished;
        book.price = price;
        return book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", yearPublished=" + yearPublished +
                ", price=" + price +
                '}';
    }
}
