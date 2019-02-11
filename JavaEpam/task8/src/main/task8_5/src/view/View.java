package view;

public class View {
    public final static String INPUT_DIRECTORY = "Enter directory -> ";
    public final static String INPUT_CHAR = "Enter letter -> ";
    public final static String INPUT_FILE = "Enter file name -> ";
    public final static String WRONG_DIRECTORY = "Directory should be of the type (C:\\...\\)";
    public final static String WRONG_CHAR = "Latter must be in the Latin alphabet";
    public final static String WRONG_DIRECTORY_AND_FILE = "Directory and File should be of the type (C:\\...\\***.txt)";
    public final static String PROCESSING = "File found";

    public static void printMessage(String message){
        System.out.println(message);
    }

}
