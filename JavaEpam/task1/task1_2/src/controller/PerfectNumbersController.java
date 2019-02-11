package controller;

import model.PerfectNumbersModel;
import view.InputSystem;
import view.PerfectNumbersView;

public class PerfectNumbersController {
    private PerfectNumbersModel model;
    private PerfectNumbersView view;

    public PerfectNumbersController() {
        this(new PerfectNumbersModel(), new PerfectNumbersView());
    }

    public PerfectNumbersController(PerfectNumbersModel model, PerfectNumbersView view) {
        this.model = model;
        this.view = view;
    }

    public void transfer() {
        model.setValue(InputSystem.inputIntPositiveValue(view));
        view.printMessageAndResult(view.OUR_NUMBERS, model.searchPerfectNumbers());
    }
}
