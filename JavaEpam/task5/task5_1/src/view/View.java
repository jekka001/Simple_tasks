package view;

import model.entity.RecordInJournal;

import java.util.List;

public class View {
    public final static String INPUT_SURNAME = "Please enter surname student : \n";
    public final static String INPUT_NAME = "Please enter name student : \n";
    public final static String INPUT_BIRTH = "Please enter birthday student : \n";
    public final static String INPUT_PHONE_NUMBER = "Please enter phone number student : \n";
    public final static String INPUT_ADDRESS = "Please enter address student(street, house, apartment) : \n";
    public final static String ERROR_SURNAME = "The surame must start with uppercase and latin letters! (Kovalenko) ";
    public final static String ERROR_NAME = "The name must start with uppercase and latin letters! (Anna) ";
    public final static String ERROR_BIRTH = "Birthday should be in format (25.12.1998) ";
    public final static String ERROR_PHONE_NUMBER = "The phone number must be in the format (+380(95)34-46-214) ";
    public final static String ERROR_ADDRESS = "The address should be entered in Latin letters in the format" +
                                                                                " (October Revolution,74,256) ";
    public final static String INPUT_MENU_NUMBER = "Please enter menu number \n";
    public final static String ERROR_MENU_NUMBER = "Wrong please repeat ";
    public final static String MENU = "1. Create a new record \n" +
                                      "2. Show records \n" +
                                      "0. Exit \n";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printRecord(String message, List<RecordInJournal> list){
        System.out.println(message);
        for(RecordInJournal element : list)
            System.out.println(element);
    }


}
