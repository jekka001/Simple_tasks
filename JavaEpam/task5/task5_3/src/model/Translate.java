package model;

import model.dataSource.DataSource;

import java.util.HashMap;

public class Translate {
    private HashMap<String, String> dictionary;

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }
    public void setDictionary(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public Translate() {
        this(new HashMap<>());
    }

    public Translate(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public String translate(String phrase){
        String regul = "[^A-Za-z]+";
        String regul2 = "[A-Za-z]+";
        String[] words = phrase.split(regul);
        String[] separators = phrase.split(regul2);
        String[] translateWords = words;
        StringBuilder result = new StringBuilder();
        int count = 0;
        for(int i = 0; i < words.length; i++)
            if(dictionary.containsKey(words[i].toLowerCase()))
                translateWords[i] = dictionary.get(words[i].toLowerCase());
        for(String word : translateWords)
            result.append(word + separators[++count]);
        return result.toString();
    }

    public void addWords(String engWord, String rusWord){
        dictionary.put(engWord.toLowerCase(),rusWord.toLowerCase());
    }

}
