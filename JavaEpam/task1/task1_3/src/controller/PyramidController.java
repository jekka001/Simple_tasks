package controller;

import model.PyramidModel;
import view.InputSystem;
import view.PyramidView;

public class PyramidController {

    private PyramidModel model;
    private PyramidView view;

    public PyramidController() {
        this(new PyramidModel(), new PyramidView());
    }

    public PyramidController(PyramidModel model, PyramidView view) {
        this.model = model;
        this.view = view;
    }

    public void pyramidCalculate() {
        model.setValue(InputSystem.inputIntValue(view));
        view.printMessageAndResult(view.OUR_PIRAMID, model.creationPyramid());
    }

}