package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputSystem {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int inputNumberSystem(TransferView view) {
        int system;
        view.printMessage(view.TRANSFER_IN);
        while(true) {
            try {
                system = Integer.parseInt(reader.readLine());
                if( (system == 2) || (system == 8) || (system == 16) )
                    break;
                else
                    view.printMessage(view.WRONG_INPUT_INT + view.TRANSFER_IN);
            }
            catch (Exception e) {
                view.printMessage(view.WRONG_INPUT_INT + view.TRANSFER_IN);
            }
        }
        return system;
    }

    public static int inputIntPositiveValue(TransferView view) {
        int number;
        view.printMessage(view.INPUT_INT);
        while(true) {
            try {
                number = Integer.parseInt(reader.readLine());
                if(number > 0)
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
