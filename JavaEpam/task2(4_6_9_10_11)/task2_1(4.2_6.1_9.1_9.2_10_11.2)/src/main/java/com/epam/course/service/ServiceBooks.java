package com.epam.course.service;

import com.epam.course.exception.UnExistItemMenu;
import com.epam.course.model.Books;
import com.epam.course.util.InputOutputFile;
import com.epam.course.model.Entity.Book;
import com.epam.course.util.ResourceManager;
import com.epam.course.util.Languare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/**
 * @author Zagrebelnyi Evgeniy
 * Class to perform operations with books
 */
public class ServiceBooks{
    private Books model = new Books();
    private ResourceManager manager = ResourceManager.INSTANCE;
    /**
     * Empty constructor that sets initial values for the object.
     */
    public ServiceBooks() { model.setBooks(InputOutputFile.load()); }

    public String showAllBooks(){return convertBooksInString(model.getBooks());}

    private String convertBooksInString(Book[] books) {
        StringBuilder str = new StringBuilder();
        for (Book book : books ) {
            str.append(book);
            str.append("\n");
        }
        return str.toString();
    }

    public String searchBooksByAuthor(String author){
        Book[] books = model.getByAuthor(author);
        if (books.length == 0)
            return manager.getMessage("NO_BOOKS") + author;

        return manager.getMessage("BOOKS_AUTHOR") + author
                + "\n" + convertBooksInString(books);
    }

    public String searchBooksByPublisher(String publisher){
        Book[] books = model.getByPublisher(publisher);
        if (books.length == 0)
            return manager.getMessage("NO_BOOKS") + publisher;

        return manager.getMessage("BOOKS_PUBLISH") + publisher
                + "\n" + convertBooksInString(books);
    }

    public String searchBooksAfterYear(int year){
        Book[] books = model.getAfterYear(year);
        if (books.length == 0)
            return manager.getMessage("NO_BOOKS_YEAR") + year;

        return manager.getMessage("BOOKS_AFTER_YEAR") + year
                + "\n" + convertBooksInString(books);
    }

    public String sortByPublisher() {
        Book[] books = model.getBooks();
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublisher().compareTo(o2.getPublisher());
            }
        });
        return convertBooksInString(books);
    }

    private Locale defineLocale(int number) throws UnExistItemMenu {
        Languare[] languares = Languare.values();
        if (number <= 0 || number > languares.length) {
            throw new UnExistItemMenu(manager.getMessage("WRONG_INPUT_DATA"));
        }
        return languares[number - 1].getLocale();
    }

    public void changeLanguare(int choise) throws UnExistItemMenu{
        manager.changeLocale(defineLocale(choise));
    }

    public void save(){
        InputOutputFile.save(model.getBooks());
    }

}