package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputSystem {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int inputIntValue(PyramidView view)  {
        view.printMessage(view.INPUT_INT);
        int number;
        while(true) {
            try {
                number = Integer.parseInt(reader.readLine());
                if( (number >= 1) && (number <= 9) ) {
                    break;
                }
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