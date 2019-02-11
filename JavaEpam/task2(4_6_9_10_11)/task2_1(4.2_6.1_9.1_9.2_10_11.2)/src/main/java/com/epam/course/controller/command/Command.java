package com.epam.course.controller.command;

import com.epam.course.service.ServiceBooks;
import com.epam.course.util.ResourceManager;
import com.epam.course.view.BooksView;

abstract public class Command {
    protected ServiceBooks serviceBooks = new ServiceBooks();
    protected BooksView view = new BooksView();
    protected ResourceManager manager = ResourceManager.INSTANCE;
    public abstract String execute();
}
