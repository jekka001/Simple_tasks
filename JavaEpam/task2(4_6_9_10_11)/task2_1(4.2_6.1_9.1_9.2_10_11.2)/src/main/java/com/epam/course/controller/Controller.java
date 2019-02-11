package com.epam.course.controller;

import com.epam.course.controller.command.Command;
import com.epam.course.dao.BooksDao;
import com.epam.course.dao.ConnectionPoolHolder;
import com.epam.course.exception.UnExistItemMenu;
import com.epam.course.model.Books;
import com.epam.course.model.Entity.Book;
import com.epam.course.util.InputOutputFile;
import com.epam.course.util.InputSystem;
import com.epam.course.view.BooksView;
import com.epam.course.service.ServiceBooks;
import com.epam.course.util.ResourceManager;
import com.epam.course.controller.command.ItemMenu;

import java.sql.SQLException;
import java.util.List;


/**
 * @author Zagrebelnyi Evgeniy
 * The class for working with books and working with the class that works on their output on the screen
 * @see Books
 * @see BooksView
 */
public class Controller {
    ResourceManager manager = ResourceManager.INSTANCE;
    private BooksView view = new BooksView();


    /**
     * method for start program.
     */
    public void run() {
        while (true) {
            try {
                view.printMessage(manager.getMessage("MAIN_MENU"));
                int number = InputSystem.inputIntValue(view, manager);
                Command command = defineCommand(number);
                view.printMessage(command.execute());
            } catch (UnExistItemMenu exp) {
                view.printError(exp.getMessage());
            }
        }
    }

    private Command defineCommand(int number) throws UnExistItemMenu {
        ItemMenu[] itemMenus = ItemMenu.values();
        if (number < 0 || number >= itemMenus.length) {
            throw new UnExistItemMenu(manager.getMessage("WRONG_INPUT_DATA"));
        }
        return itemMenus[number].getCommand();
    }
}
