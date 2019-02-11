package view;

public class PyramidView {
    public static final String INPUT_INT = "Please enter a number from 1 to 9 = ";
    public static final String WRONG_INPUT = "Wrong input! Repeat please! ";
    public static final String OUR_PIRAMID = "Piramid: ";

    public void printMessage(String message)
    {
        System.out.println(message);
    }

    public void printMessageAndResult(String message, String result) {
        System.out.println(message);
        System.out.println(result);
    }

}
