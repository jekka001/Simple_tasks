package view;

import model.entity.Wagon;

/**
 * @author Zagrebelnyi Evgeniy
 * This class for outputting data
 */
public class View {
    public static final String MENU ="Choose operation:\n " +
            "1: total number of passenger in the train\n" +
            "2: total amount of baggage(kg) \n" +
            "3: sorting of wagon on the condition of comfort \n" +
            "4: Find a wagon with the right number of passengers \n" +
            "0: Exit \n";
    public static final String INPUT_INT = "Please enter number menu = ";
    public static final String INPUT_NUMBER_PASSENGERS = "Please enter number passengers = ";
    public static final String WRONG_INPUT = "Wrong input! Repeat please! ";

    /**
     * method for output wagon
     * @param message - message for user
     * @param wagons - wagons
     */
    public void printWagon(String message, Wagon[] wagons) {
        System.out.println(message);
        for(Wagon wagon : wagons)
            System.out.println(wagon);
    }

    /**
     * method for output sum of passengers or baggage
     * @param message - message for user
     * @param count - sum of passengers or baggage
     */
    public void printNumber(String message, double count)
    {
        System.out.println(message + count);
    }

    /**
     * method for output message
     * @param message - message for user
     */
    public void printMessage(String message){
        System.out.println(message);
    }
}
