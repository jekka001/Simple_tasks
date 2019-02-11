package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputSystem {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int inputIntValue(View view,int max)  {
        int number;
        view.printMessage(view.INPUT_INT);
        while(true) {
            try {
                number = Integer.parseInt(reader.readLine());
                if( (number >= 0) && (number < max))
                    break;
                else
                    view.printMessage(view.WRONG_INPUT + view.INPUT_INT);
            }
            catch (Exception e) {
                view.printMessage(view.WRONG_INPUT + view.INPUT_INT);
            }
        }
        return number;
    }

    public static String[] inputStringValue(View view)  {
        String text ;
        String value[] = new String[5];
        int count =0;
        view.printMessage(view.INPUT_DATE);
        while(true) {
            try {
                text = reader.readLine();
                if( text.split(" ").length == 4)
                    break;
                else
                    view.printMessage(view.WRONG_INPUT + view.INPUT_INT);
            }
            catch (Exception e) {
                view.printMessage(view.WRONG_INPUT + view.INPUT_INT);
            }
        }
        for(String temp : text.split(" "))
            value[count++] = temp;
        return value;
    }
}
