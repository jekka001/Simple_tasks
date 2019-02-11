package inputSystem;

import view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputSystem {
    private static BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

    public static int inputLength(View view){
        int result = 0;
        try {
            while(true) {
                view.printMessage(view.INPUT_LENGTH);
                result = Integer.parseInt(reader.readLine());
                if(result > 0)
                    break;
                else
                    view.printMessage(view.WRONG_LENGTH);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int[] inputRange(View view){
        int max = 0;
        int min = 0;
        try {
            while (true) {
                view.printMessage(view.INPUT_MIN);
                min = Integer.parseInt(reader.readLine());
                view.printMessage(view.INPUT_MAX);
                max = Integer.parseInt(reader.readLine());
                if(min > max)
                    view.printMessage(view.WRONG);
                else
                    break;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return new int[]{min,max};
    }
}
