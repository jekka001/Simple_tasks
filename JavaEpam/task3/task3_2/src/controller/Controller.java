package controller;

import model.Shop;
import view.InputSystem;
import view.View;

public class Controller {
    private View view;
    private EnumOperations enumOperations;
    private Operation operation;

    public View getView() { return view; }

    public EnumOperations getEnumOperations() { return enumOperations; }

    public Operation getOperation() { return operation; }

    public void setEnumOperations(EnumOperations enumOperations) { this.enumOperations = enumOperations; }

    public void setOperation(Operation operation) { this.operation = operation; }

    public void setView(View view) { this.view = view; }

    public Controller() { this(new View()); }

    public Controller(View view) {
        this.view = view;
        enumOperations = EnumOperations.values()[1];
        operation = new Operation(new Shop(),view);
    }

    public void run(){
        menu();
    }

    private void menu(){
        while(true) {
            view.printMessage(view.MENU);
            operation.dateInModel();
            switch (enumOperations.values()[InputSystem.inputIntValue(view, 5)]) {
                case CREATE_DEPARTMENT:
                    operation.createDepartment();
                    break;
                case DELETE_DEPARTMENT:
                    operation.deleteDepartment();
                    break;
                case SORTED_DEPARTMENT:
                    operation.sortedDepartment();
                    break;
                case GOODS_SUPPLY:
                    operation.addProduct();
                    break;
                case EXIT:
                    return;
            }
        }
    }

}
