package com.epam.course.model.Data;

import com.epam.course.model.Entity.Book;
/**
 * @author Zagrebelnyi Evgeniy
 * class for fill int the data.
 */
public class DataSource {
    /**
     * method for fill the array of books.
     * @return array of books. Type = Book[].
     * @see Book
     */
    public static Book[] getBooks(){
        return new Book[]{
                new Book("Title1","Shevchenko","BXV",2010,320,450.0),
                new Book("Title2","Shevchenko","Word",2000,120,250.0),
                new Book("Title3","Sokolov","BXV",1999,820,1050.0),
                new Book("Title4","Maslov","Piter",2016,555,620.5),
                new Book("Title5","Sokolov","Piter",2011,876,555.5),
                new Book("Title6","Sokolov","BXV",2001,400,300.0),
                new Book("Title7","Petrov","Word",2018,276,155.5),
                new Book("Title8","Shevchenko","Piter",2013,456,100.0),
                };
    }
}