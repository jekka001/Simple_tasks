package com.epam.course.controller.command;

import com.epam.course.exception.UnExistItemMenu;
import com.epam.course.util.InputSystem;

public class Lang extends Command {
    @Override
    public String execute() {
        view.printMessage(manager.getMessage("LANGUARE"));
        while (true){
            try {
                serviceBooks.changeLanguare(InputSystem.inputIntValue(view,manager));
                break;
            }catch (UnExistItemMenu exp){
                view.printError(exp.getMessage());
            }
        }
        return null;
    }
}
