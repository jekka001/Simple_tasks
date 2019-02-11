package view;

public class MatrixView {
    public static final String INPUT_INT = "Please enter positive integer = ";
    public static final String WRONG_INPUT = "Wrong input! Repeat please! ";
    public static final String OUR_PIRAMID_INITIAL = "Matrix initial: ";
    public static final String OUR_PIRAMID_GOT = "Matrix got: ";

    public void printMessage(String message)
    {
        System.out.println(message);
    }

    public void printMessageAndResult(String message, String matrixIni, String messageTwo, String result) {
        System.out.println(message);
        System.out.println(matrixIni);
        System.out.println(messageTwo);
        System.out.println(result);
    }

}
