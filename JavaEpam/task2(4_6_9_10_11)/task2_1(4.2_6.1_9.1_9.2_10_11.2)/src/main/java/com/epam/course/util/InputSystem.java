package com.epam.course.util;

import java.util.Scanner;

import com.epam.course.view.BooksView;
import com.epam.course.util.ResourceManager;
import com.epam.course.util.Validator;

/**
 * @author Zagrebelnyi Evgeniy
 * Class for data entry.
 */
public class InputSystem {
    private static Scanner sc = new Scanner(System.in);
    /**
     * method to enter a menu number. Number mast be from 0 to 5 and an integer number.
     * @param view - parameter for working with the class BooksView. Working with the presentation of an array of books.
     * @return number for program menu.
     */
    public static int inputIntValue(BooksView view, ResourceManager manager)  {
        view.printMessage(manager.getMessage("INPUT_INT_DATA"));
        while (!sc.hasNextInt()) {
            view.printMessage(manager.getMessage("WRONG_INPUT_DATA") + manager.getMessage("INPUT_INT_DATA"));
            sc.next();
        }
        return sc.nextInt();
    }

    public static String inputStringValue(BooksView view, ResourceManager manager)  {
        while (true) {
            view.printMessage(manager.getMessage("INPUT_STRING_DATA"));
            String text = sc.next();
            if ( Validator.isCorrectString(text)) {
                return text;
            }
            view.printError(manager.getMessage("WRONG_INPUT_DATA"));
        }
    }

}

