package view;

public class PerfectNumbersView {
    public static final String INPUT_INT = "Enter positive integer = ";
    public static final String WRONG_INPUT_INT = "Wrong input! Repeat please! ";
    public static final String OUR_NUMBERS = "Perfect numbers = ";
    public static final String OUR_NOT_NUMBERS = "Not perfect numbers ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndResult(String message,String result) {
        System.out.println(message + result);
    }

}