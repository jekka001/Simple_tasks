package controller;

import model.MatrixModel;
import view.InputSystem;
import view.MatrixView;

public class MatrixController {
    private MatrixModel model;
    private MatrixView view;

    public MatrixController()
    {
        this(new MatrixModel(), new MatrixView());
    }

    public MatrixController(MatrixModel model, MatrixView view) {
        this.model = model;
        this.view = view;
    }

    public void matrixCalculate() {
        int value = InputSystem.inputIntValue(view);
        model.setValue(value);
        model.setMatrix(new int[value][value]);
        model.setGotMatrix(new int[value][value]);
        view.printMessageAndResult(view.OUR_PIRAMID_INITIAL, InputSystem.matrixString(model.creationMatrix(),value),
                view.OUR_PIRAMID_GOT, InputSystem.matrixString(model.takeOverMatrix(),value));
    }
}