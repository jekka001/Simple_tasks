package controller;

import model.entity.Word;
import util.MyTask;

import java.util.Arrays;
import java.util.Comparator;

public class Controller {
    public void run(){
        MyTask myTask = new MyTask();
        myTask.read();
        Word[] words = new Word[myTask.processingText().size()];
        int count = 0;
        for(Word word : myTask.processingText())
            words[count++]= word;
        Arrays.sort(words,new Word());
        for(Word word : words)
            System.out.print(word.getWord()+" ");
    }
}
