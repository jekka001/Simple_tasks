package com.epam.course.controller.command;

import com.epam.course.util.InputSystem;

public class SearchByYear extends Command {
    @Override
    public String execute() {
        return serviceBooks.searchBooksAfterYear(InputSystem.inputIntValue(view,manager));
    }
}
