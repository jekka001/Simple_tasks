package com.epam.course.model.Entity;

import com.epam.course.util.ResourceManager;
import com.sun.org.apache.xerces.internal.impl.PropertyManager;

import java.io.Serializable;
import java.util.Comparator;

/**
 * @author Zagrebelnyi Evgeniy
 * Class to describe the object Book and implements Comparator
 * @see Comparator
 */
public class Book  implements Serializable {
    private static int nextId = 0;
    private int id;
    private ResourceManager manager = ResourceManager.INSTANCE;
    private String nameBook;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double price;

    {this.id = nextId++;}

    /**
     *Empty constructor that sets initial values for the object nameBook = "Book", author = "Author",
     * publisher = "Publisher", year = 2000, pages = 0, price = 0.
     */
    public Book() {
        this("Book","Author","Publisher",2000,0,0);
    }

    public Book(String nameBook, String author){
        this.nameBook = nameBook;
        this.author = author;
    }

    /**
     *The constructor that allows the programmer to create an object with parameters
     * @param nameBook - The title of the book.
     * @param author - The author of the book.
     * @param publisher - The publisher of the book.
     * @param year - The year of publication of the book.
     * @param pages - The number of pages in books.
     * @param price - The price of the book.
     */
    public Book(String nameBook, String author, String publisher, int year, int pages, double price) {
        this.nameBook = nameBook;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public void setNameBook(String nameBook) { this.nameBook = nameBook; }
    public void setAuthor(String author) { this.author = author; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setYear(int year) { this.year = year; }
    public void setPages(int pages) { this.pages = pages; }
    public void setPrice(double price) { this.price = price; }
    public String getNameBook() { return nameBook; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }
    public int getYear() { return year; }
    public int getPages() { return pages; }
    public double getPrice() { return price; }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Return the title book, name author, publication, year of the publisher,
     * number of pages and price of the book.
     * @return the title book, name author, publication, year of the publisher,
     * number of pages and price of the book.
     */
    @Override
    public String toString() {
        return String.format(manager.getMessage("INFO_BOOKS"),nameBook, author, publisher, year, pages, price);
    }

}
