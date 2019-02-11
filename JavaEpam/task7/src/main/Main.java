package main;

//import main.task7_1.Runner;
//import main.task7_2.Runner;
//import main.task7_3_4_5.Runner;

import main.task7_6.Runner;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args){
        // 1 and 2
        /*try {
            try {
                new Runner().run();
            } catch (NoSuchMethodException |
                    InstantiationException |
                    InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        /*catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/
        //3 - 6
        new Runner().run();
    }
}
