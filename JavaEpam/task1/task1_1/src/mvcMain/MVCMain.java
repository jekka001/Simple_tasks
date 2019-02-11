package mvcMain;

import controller.TransferController;
import model.TransferModel;
import view.TransferView;

public class MVCMain {

    public static void main(String[] args) {
        new TransferController(new TransferModel(), new TransferView()).transfer();
    }

}