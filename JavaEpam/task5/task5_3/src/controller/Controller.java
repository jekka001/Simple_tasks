package controller;

import model.Translate;
import model.dataSource.DataSource;
import view.View;

public class Controller {
    private Translate translate;

    public Translate getTranslate() {
        return translate;
    }
    public void setTranslate(Translate translate) {
        this.translate = translate;
    }

    public Controller() {
        this(new Translate());
    }

    public Controller(Translate translate) {
        this.translate = translate;
    }

    public void run(){
        translate.setDictionary(DataSource.getDictionary());
        String text = "Hello my little boy. I hope you dont touch my hourse!!!";
        translate.addWords("hello","привет");
        View.printMessage(text);
        View.printMessage(View.TRANSLATE);
        View.printMessage(translate.translate(text));

    }


}
