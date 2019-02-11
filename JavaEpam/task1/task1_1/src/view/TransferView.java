package view;

public class TransferView {
    public static final String TRANSFER_IN = "Please enter number your system(binary - 2,octal - 8,hexadecimal - 16) = ";
    public static final String INPUT_INT = "Enter positive integer = ";
    public static final String WRONG_INPUT_INT = "Wrong input! Repeat please! ";
    public static final String OUR_INT = "Number = ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndResult(String message,String result) {
        System.out.println(message + result);
    }
}
