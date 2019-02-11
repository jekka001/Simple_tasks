package com.epam.course.controller.command;

import com.epam.course.util.InputSystem;


public class SearchByAuthor extends Command {
    @Override
    public String execute() {
        return serviceBooks.searchBooksByAuthor(InputSystem.inputStringValue(view,manager));
    }
}
