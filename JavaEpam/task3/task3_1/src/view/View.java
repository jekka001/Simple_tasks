package view;

import model.Entity.KidsToys;

public class View {
    public static final String MENU_OPERATION ="Choose operation: \n" +
            "1: Sorted toys by price \n" +
            "2: The sum of all price toys \n" +
            "3: To search for toys the price which from 300 to 700 \n" +
            "0: Exit \n";
    public static final String MENU_ROOMS ="Choose rooms: \n" +
            "1: Rooms all toys \n" +
            "2: Rooms car toys \n" +
            "3: Rooms ball toys \n" +
            "4: Rooms doll toys \n" +
            "0: Exit \n";
    public static final String INPUT_INT = "Please enter number menu = ";
    public static final String WRONG_INPUT = "Wrong input! Repeat please! ";

    public void printToys(String message, KidsToys[] toys) {
        System.out.println(message);
        for(KidsToys toy : toys)
            System.out.println(toy);
        System.out.println();
    }
    public void printToys(String message, double sum) {
        System.out.println(message+sum);
    }
    public void printMessage(String message){
        System.out.println(message);
    }


}

