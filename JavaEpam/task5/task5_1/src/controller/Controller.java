package controller;

import inputSystem.InputSystem;
import model.Journal;
import model.entity.RecordInJournal;
import view.View;

public class Controller {
    private View view;
    private Journal journal;

    public View getView() { return view; }
    public void setView(View view) { this.view = view; }
    public Journal getJournal() { return journal; }
    public void setJournal(Journal journal) { this.journal = journal; }

    public Controller() {
        this(new View(),new Journal());
    }

    public Controller(View view, Journal journal) {
        this.view = view;
        this.journal = journal;
    }

    public void run(){
        InputSystem.setView(view);
        while (true) {
            switch (InputSystem.inputMenuValue()) {
                case 1:
                    String[] record = InputSystem.inputRecordValue();
                    RecordInJournal recordInJournal = new RecordInJournal(record[0], record[1], record[2], record[3], record[4]);
                    journal.getListRecords().add(recordInJournal);
                    break;
                case 2:
                    view.printRecord("Record in the journal : ", journal.getListRecords());
                    break;
                case 0:
                    view.printMessage("Good Bye");
                    return;
            }
        }
    }

}
