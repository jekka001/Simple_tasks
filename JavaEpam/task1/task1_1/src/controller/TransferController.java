package controller;

import model.TransferModel;
import view.InputSystem;
import view.TransferView;

public class TransferController {

    private TransferModel model;
    private TransferView view;
    private InputSystem inputSystem;

    public TransferController() {
        this(new TransferModel(), new TransferView());
    }

    public TransferController(TransferModel model, TransferView view) {
        this.model = model;
        this.view = view;
        inputSystem = new InputSystem();
    }

    public void transfer() {
        model.setValue(inputSystem.inputIntPositiveValue(view));
        model.setSystem(inputSystem.inputNumberSystem(view));
        view.printMessageAndResult(view.OUR_INT, model.transferSystem());
    }
}
