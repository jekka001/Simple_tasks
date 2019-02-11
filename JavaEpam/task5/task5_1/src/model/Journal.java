package model;

import model.entity.RecordInJournal;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<RecordInJournal> listRecords;

    public List<RecordInJournal> getListRecords() { return listRecords; }
    public void setListRecords(List<RecordInJournal> listRecords) { this.listRecords = listRecords; }

    public Journal() {
        this(new ArrayList<RecordInJournal>());
    }

    public Journal(List<RecordInJournal> listRecords) {
        this.listRecords = listRecords;
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
