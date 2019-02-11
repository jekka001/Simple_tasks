package mvcMain;

import controller.MatrixController;
import model.MatrixModel;
import view.MatrixView;

public class MatrixMvcMain {
    public static void main(String[] args) {
        new MatrixController(new MatrixModel(), new MatrixView()).matrixCalculate();
    }
}