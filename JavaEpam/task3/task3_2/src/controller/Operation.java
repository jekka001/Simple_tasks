package controller;

import model.Shop;
import realizationModel.RealizationModel;
import view.InputSystem;
import view.View;

public class Operation {
    private Shop model;
    private View view;
    private RealizationModel realizationModel;


    public Shop getModel() { return model; }

    public void setModel(Shop model) { this.model = model; }

    public View getView() { return view; }

    public void setView(View view) { this.view = view; }

    public RealizationModel getRealizationModel() { return realizationModel; }

    public void setRealizationModel(RealizationModel realizationModel) { this.realizationModel = realizationModel; }

    public Operation() {
        this(new Shop("ATB"),new View());
    }

    public Operation(Shop model, View view) {
        this.model = model;
        this.view = view;
        this.realizationModel = new RealizationModel(model);
    }

    public void createDepartment(){
        String[] tempDate ;
        tempDate = InputSystem.inputStringValue(view);
        realizationModel.createDepartment(tempDate[0], tempDate[1], tempDate[2], tempDate[3]);
    }

    public void deleteDepartment(){
        if(model.getDepartment().length > 0) {
            view.printMessage(view.DELETE);
            view.printNumberDepartment(model.getDepartment());
            realizationModel.deleteDepartment(InputSystem.inputIntValue(view, model.getDepartment().length));
        }
        else
            view.printMessage(view.NOT_DEPARTMENT);
    }

    public void sortedDepartment(){
        if(model.getDepartment().length > 0) {
            realizationModel.sort();
            view.printShop("Sort Department " + model.toString() + ": ", model.getDepartment());
        }
        else
            view.printMessage(view.NOT_DEPARTMENT);
    }

    public void addProduct(){
        if(model.getDepartment().length > 0) {
            view.printMessage(view.ADD);
            view.printNumberDepartment(model.getDepartment());
            int department = InputSystem.inputIntValue(view, model.getDepartment().length);
            view.printMessage("Enter the quantity of goods");
            model.getDepartment()[department].setAmong(InputSystem.inputIntValue(view, 1000));
        }
        else
            view.printMessage(view.NOT_DEPARTMENT);
    }

    public void dateInModel(){
        if(model.getDepartment().length > 0)
            view.printShop("Department " + model.toString()+": ", model.getDepartment());
    }

}
