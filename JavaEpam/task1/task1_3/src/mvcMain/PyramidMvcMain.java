package mvcMain;

import controller.PyramidController;
import model.PyramidModel;
import view.PyramidView;

public class PyramidMvcMain {
    public static void main(String[] args) {
        new PyramidController(new PyramidModel(),new PyramidView()).pyramidCalculate();
    }
}