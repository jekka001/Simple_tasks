package model.entity;


import model.entity.Interface.SentenceObject;


public class PunctuationMark extends Symbol implements SentenceObject {
    private boolean endOfSentence;

    public PunctuationMark(char symbol) {
        super(symbol);

        if(symbol == '.' || symbol == '?' || symbol == '!')
            endOfSentence = true;
    }

    public static boolean isPunctuation(char symbol){
        if(symbol >= 'a' && symbol <= 'z' || symbol >= 'A' && symbol <= 'Z')
            return false;
        else
            return true;
    }

    public static PunctuationMark create(char symbol){
        if(isPunctuation(symbol))
            return new PunctuationMark(symbol);
        else
            return null;
    }

    public boolean isEndOfSentence(){
        return endOfSentence;
    }

}
