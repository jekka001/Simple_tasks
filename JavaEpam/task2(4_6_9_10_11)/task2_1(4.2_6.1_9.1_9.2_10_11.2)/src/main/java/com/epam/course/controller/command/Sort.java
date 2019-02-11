package com.epam.course.controller.command;

public class Sort extends Command {
    @Override
    public String execute() {
        view.printMessage(manager.getMessage("SORTED_BOOKS"));
        return serviceBooks.sortByPublisher();
    }
}
