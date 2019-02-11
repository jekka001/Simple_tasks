package com.epam.course.view;

/**
 * @author Zagrebelnyi Evgeniy
 * Class to display array of the books and work program menu.
 */
public class BooksView {
    public void printMessage(String s) {
        if(!isNullString(s))
        System.out.println(s);
    }

    public void printError(String str) {
        if(!isNullString(str))
        System.err.println(str);
    }

    private static boolean isNullString(String str) {
        return str == null ? true : str.trim().equals("") ? true : false;
    }
}