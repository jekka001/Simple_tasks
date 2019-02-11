package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputSystem {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int inputIntValue(View view)  {
        int number;
        view.printMessage(view.INPUT_INT);
        while(true) {
            try {
                number = Integer.parseInt(reader.readLine());
                if( (number >= 0) && (number < 7))
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

}
