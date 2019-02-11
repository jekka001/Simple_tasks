package model.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Data {
    public static List getSentencePunctuation(){
        return Arrays.asList(
                ",", ".", "!", "?", "—", "-", "\"", "'", "(", ")",
                "<", ">", ":", ";", "[", "]", "{", "}", "‒", "–", "—",
                "―", "„", "“", "«", "»", "‘", "’", "...", "?!", "!?",
                "*", "/", "=", "==", "!=", ">=", "=<", "+"
        );
    }

    public static List getVolwes(){
        return Arrays.asList(
                'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'
        );
    }

    public static List getConsonant(){
        return Arrays.asList(
                "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P",
                "Q", "R", "S", "T", "V", "W", "X", "Z", "b", "c", "d", "f",
                "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t",
                "v", "w", "x", "z"
        );
    }

}
