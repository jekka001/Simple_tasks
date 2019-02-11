package controller;

import model.Data.DataSource;
import model.Model;
import view.InputSystem;
import view.View;

public class Controller {
    private Model model;
    private View view;
    private Operation operation;

    public Controller() {
        this(new Model(),new View());
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        operation = Operation.values()[0];
    }

    public void run(){
        model.setShapes(DataSource.getShape());
        menu();
    }

    public void menu() {
        while (true) {
            view.printShape("All shapes: ",model.getShapes());
            view.printMessage(view.MENU);
            operation = Operation.values()[InputSystem.inputIntValue(view)];
            switch (operation) {
                case ALL_AREA_OF_SHAPE:
                    model.setOperation(Operation.values()[1]);
                    view.printShapeArea("The sum of all area of Shapes ",model.sumAreaShapes());
                    break;
                case ALL_AREA_OF_TRIANGLE:
                    model.setOperation(Operation.values()[2]);
                    view.printShapeArea("Triangle sumArea = ", model.sumAreaShapes());
                    break;
                case ALL_AREA_OF_RECTANGLE:
                    model.setOperation(Operation.values()[3]);
                    view.printShapeArea("Rectangle sumArea = ", model.sumAreaShapes());
                    break;
                case ALL_AREA_OF_CIRCLE:
                    model.setOperation(Operation.values()[4]);
                    view.printShapeArea("Circle sumArea = ", model.sumAreaShapes());
                    break;
                case SORTED_SHAPES_BY_AREA:
                    model.setOperation(Operation.values()[5]);
                    view.printShape("Sorted shape by Area: ", model.sortArea());
                    break;
                case SORTED_SHAPES_BY_COLOR:
                    model.setOperation(Operation.values()[6]);
                    view.printShape("Sorted shape by Color: ", model.sortColor());
                    break;
                case EXIT:
                    return;
            }
        }
    }
}