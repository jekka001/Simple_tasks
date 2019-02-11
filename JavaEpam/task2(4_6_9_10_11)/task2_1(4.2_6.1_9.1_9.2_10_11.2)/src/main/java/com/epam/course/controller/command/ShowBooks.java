package com.epam.course.controller.command;

public class ShowBooks extends Command {
    @Override
    public String execute() {
        view.printMessage(manager.getMessage("LIST_BOOKS"));
        return serviceBooks.showAllBooks();
    }
}
