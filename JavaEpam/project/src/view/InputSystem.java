package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Zagrebelnyi Evgeniy
 * This class for data entry
 */
public class InputSystem {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * method for selecting a menu item
     * @param view - presentation data
     * @return number menu
     */
    public static int inputIntMenu(View view)  {
        int number;
        view.printMessage(view.INPUT_INT);
        while(true) {
            try {
                number = Integer.parseInt(reader.readLine());
                if( (number >= 0) && (number < 5))
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

    /**
     * method for entering the number of passengers
     * @param view - presentation data
     * @return number of passengers
     */
    public static int inputIntNumberPassengers(View view){
        int number;
        view.printMessage(view.INPUT_NUMBER_PASSENGERS);
        while(true) {
            try {
                number = Integer.parseInt(reader.readLine());
                if( (number >= 0) && (number < 80))
                    break;
                else
                    view.printMessage(view.WRONG_INPUT + view.INPUT_NUMBER_PASSENGERS);
            }
            catch (Exception e) {
                view.printMessage(view.WRONG_INPUT + view.INPUT_NUMBER_PASSENGERS);
            }
        }
        return number;
    }
}
