package model.entity;

import model.entity.Interface.SentenceObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sentence implements Iterable<SentenceObject>{
    private List<SentenceObject> lexems;

    public Sentence(){
        lexems = new ArrayList<>();
      }

    public void addLexem(SentenceObject lexem){
        lexems.add(lexem);
    }

    public List<SentenceObject> getLexems() { return lexems; }

    @Override
    public Iterator<SentenceObject> iterator() {
        return lexems.iterator();
    }
}
