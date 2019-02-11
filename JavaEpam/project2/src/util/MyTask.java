package util;

import model.data.Data;
import model.entity.Interface.SentenceObject;
import model.entity.PunctuationMark;
import model.entity.Sentence;
import model.entity.Word;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyTask {
    private String text;
    private Sentence sentence;

    public MyTask() {
        sentence = new Sentence();
    }

    public MyTask(String text) {
        this.text = text;
    }

    public List<Word> processingText(){
        List<Word> volwesWords = new ArrayList();
        for(SentenceObject object : sentence.getLexems()) {
            if (object instanceof Word) {
                if (wordWithVolwes((Word) object))
                    volwesWords.add((Word) object);
            }
        }
        return volwesWords;

    }

    private boolean wordWithVolwes(Word word){
        return Data.getVolwes().contains(word.getWord().charAt(0));
    }


    private boolean equaleze(Word word1, Word word2){
        return (Character.toUpperCase(word1.getWord().charAt(0)) > Character.toUpperCase(word2.getWord().charAt(0)));
    }


    private void getWordInSentence(String lexem){
        StringBuilder word = new StringBuilder();
        for(char letter : lexem.toCharArray())
            if(!PunctuationMark.isPunctuation(letter)) {
                word.append(letter);
            } else{
                if (word.toString().length()>0)
                    sentence.addLexem(new Word(word.toString()));
                sentence.addLexem(new PunctuationMark(letter));
                if(!word.toString().equals(""))
                    word.delete(0, word.length());
            }

    }

    private void getSentenceInText(List<String> sentence){
        for (String lexem : sentence)
            getWordInSentence(lexem+" ");
    }

    public void read(){
        Scanner scanner = new Scanner(System.in);
        List<String> sentences = new ArrayList();
        while(true) {
            sentences.add(scanner.next());
            if(new PunctuationMark(sentences.get(sentences.size()-1).toCharArray()[sentences.get(sentences.size() - 1).length()-1]).isEndOfSentence()) {
                getSentenceInText(sentences);
                sentences.clear();
            }else {
                if (sentences.get(sentences.size() - 1).equals("exit"))
                    break;
            }
        }
    }

}
