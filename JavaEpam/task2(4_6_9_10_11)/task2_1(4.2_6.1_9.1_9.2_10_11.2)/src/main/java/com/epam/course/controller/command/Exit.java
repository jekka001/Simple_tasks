package com.epam.course.controller.command;

public class Exit extends Command{

    @Override
    public String execute() {
        serviceBooks.save();
        System.exit(0);
        return null;
    }
}
