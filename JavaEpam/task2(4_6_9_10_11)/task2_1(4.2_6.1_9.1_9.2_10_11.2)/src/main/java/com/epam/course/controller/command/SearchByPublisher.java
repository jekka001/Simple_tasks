package com.epam.course.controller.command;

import com.epam.course.util.InputSystem;

public class SearchByPublisher extends Command {
    @Override
    public String execute() {
        return serviceBooks.searchBooksByPublisher(InputSystem.inputStringValue(view,manager));
    }
}
