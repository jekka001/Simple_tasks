package model.entity;

import model.entity.Interface.SentenceObject;

import java.util.Comparator;


public class Word implements SentenceObject,Comparator {
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Word() {
    }

    public Word(String word) {
        this.word = word;
    }


    @Override
    public int compare(Object o1, Object o2) {
        char word1 = Character.toUpperCase(((Word)o1).getWord().charAt(0));
        char word2 = Character.toUpperCase(((Word)o2).getWord().charAt(0));
        return word1-word2;
    }
}
