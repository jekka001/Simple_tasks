package com.epam.course.controller.command;
/**
 * @author Zagrebelnyi Evgeniy
 * Class to denote operations
 * @see Enum
 */
public enum ItemMenu {
    EXIT(new Exit()),
    SHOW_BOOKS(new ShowBooks()),
    SEARCH_BY_AUTHOR(new SearchByAuthor()),
    SEARCH_BY_PUBLISHER(new SearchByPublisher()),
    SEARCH_BY_YEAR(new SearchByYear()),
    SORT_BY_PUBLISHER(new Sort()),
    LANG(new Lang());

    private Command command;
    ItemMenu(Command command){this.command = command;}
    public Command getCommand(){return command;}
}
