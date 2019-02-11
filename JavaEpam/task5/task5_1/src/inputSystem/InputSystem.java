package inputSystem;

import verification.Verification;
import view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputSystem {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static String temp;
    private static View view;

    public static View getView() { return view; }
    public static void setView(View view) { InputSystem.view = view; }

    public static int inputMenuValue()  {
        int number;
        view.printMessage(view.MENU);
        view.printMessage(view.INPUT_MENU_NUMBER);
        while(true) {
            try {
                number = Integer.parseInt(reader.readLine());
                if(Verification.menuNumber(number))
                    break;
                else
                    view.printMessage(view.ERROR_MENU_NUMBER + view.INPUT_MENU_NUMBER);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return number;
    }

    public static String[] inputRecordValue(){
        String[] dataStudent = new String[5];
        try {
            dataStudent[0] = inputSurname();
            dataStudent[1] = inputName();
            dataStudent[2] = inputBirth();
            dataStudent[3] = inputPhoneNumber();
            dataStudent[4] = inputAddress();
        }catch (Exception e){
            e.printStackTrace();
        }
        return dataStudent;
    }

    private static String inputSurname() throws IOException {
        while (true) {
            view.printMessage(view.INPUT_SURNAME);
            temp = reader.readLine();
            if(Verification.surnameAndName(temp))
                break;
            else
                view.printMessage(view.ERROR_SURNAME);
        }
        return temp;
    }

    private static String inputName() throws IOException {
        while (true) {
            view.printMessage(view.INPUT_NAME);
            temp = reader.readLine();
            if(Verification.surnameAndName(temp))
                break;
            else
                view.printMessage(view.ERROR_NAME);
        }
        return temp;
    }

    private static String inputBirth() throws IOException {
        while (true) {
            view.printMessage(view.INPUT_BIRTH);
            temp = reader.readLine();
            if(Verification.birth(temp))
                break;
            else
                view.printMessage(view.ERROR_BIRTH);
        }
        return temp;
    }

    private static String inputPhoneNumber() throws IOException {
        while (true) {
            view.printMessage(view.INPUT_PHONE_NUMBER);
            temp = reader.readLine();
            if(Verification.phoneNumber(temp))
                break;
            else
                view.printMessage(view.ERROR_PHONE_NUMBER);
        }
        return temp;
    }

    private static String inputAddress() throws IOException {
        while (true) {
            view.printMessage(view.INPUT_ADDRESS);
            temp = reader.readLine();
            if(Verification.address(temp))
                break;
            else
                view.printMessage(view.ERROR_ADDRESS);
        }
        return temp;
    }



}
