package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputSystem {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int inputIntPositiveValue(PerfectNumbersView view) {
        int number;
        view.printMessage(view.INPUT_INT);
        while(true) {
            try {
                number = Integer.parseInt(reader.readLine());
                if (number >= 1)
                    if (number < 6)
                        view.printMessage(view.OUR_NOT_NUMBERS + view.INPUT_INT);
                    else
                        break;
                else
                    view.printMessage(view.WRONG_INPUT_INT + view.INPUT_INT);
            }
            catch (Exception e) {
                view.printMessage(view.WRONG_INPUT_INT + view.INPUT_INT);
            }
        }
        return number;
    }
}