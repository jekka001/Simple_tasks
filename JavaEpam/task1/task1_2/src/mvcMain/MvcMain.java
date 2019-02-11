package mvcMain;

import controller.PerfectNumbersController;
import model.PerfectNumbersModel;
import view.PerfectNumbersView;

public class MvcMain {
    public static void main(String[] args) {
        new PerfectNumbersController(new PerfectNumbersModel(), new PerfectNumbersView()).transfer();
    }
}