package com.epam.course;

import com.epam.course.controller.Controller;


/**
 * @author Zagrebelnyi Evgeniy
 * Program to search a book by book title, author name, publisher name, and book sorting by publisher.
 * @see Controller
 */
public class Main {
    public static void main(String[] args) {
        new Controller().run();
    }
}
