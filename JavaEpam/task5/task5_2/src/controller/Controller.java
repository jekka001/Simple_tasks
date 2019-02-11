package controller;

import generation.GenerationClass;
import inputSystem.InputSystem;
import view.View;

import javax.naming.OperationNotSupportedException;

public class Controller {
    private View view;
    private GenerationClass generationClass;

    public View getView() {
        return view;
    }
    public void setView(View view) {
        this.view = view;
    }
    public GenerationClass getGenerationClass() {
        return generationClass;
    }
    public void setGenerationClass(GenerationClass generationClass) {
        this.generationClass = generationClass;
    }

    public Controller() {
        this(new View(), new GenerationClass());
    }

    public Controller(View view, GenerationClass generationClass) {
        this.view = view;
        this.generationClass = generationClass;
    }

    public void run(){
        generationClass.setLeng(InputSystem.inputLength(view));
        int[] range = InputSystem.inputRange(view);
        generationClass.setMin(range[0]);
        generationClass.setMax(range[1]);
        view.printList(generationClass.generList());
        try {
            view.printSet(generationClass.generSet());
        } catch (OperationNotSupportedException e) {
            view.printMessage(view.WRONG_FILL_SET);
        }
    }
}
