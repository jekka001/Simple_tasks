package inputSystem;

import checking.Checking;
import view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputSystem {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String directory(View view){
        String resultDirectory;
        while(true){
            view.printMessage(view.INPUT_DIRECTORY);
            try {
                resultDirectory = reader.readLine();
                if(Checking.directory(resultDirectory)) {
                    return resultDirectory;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
                view.printMessage(view.WRONG_DIRECTORY);
        }
    }

    public static char letter(View view){
        char resultLetter;
        String temp;
        while (true){
            view.printMessage(view.INPUT_CHAR);
            try {
                temp = reader.readLine();
                if(Checking.letter(temp)){
                    resultLetter = temp.charAt(0);
                    return resultLetter;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            view.printMessage(view.WRONG_CHAR);
        }
    }

    public static String fileName(View view){
        String resultFileName;
        while(true){
            view.printMessage(view.INPUT_FILE);
            try {
                resultFileName = reader.readLine();
                if(Checking.fileName(resultFileName)){
                    return resultFileName;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            view.printMessage(view.WRONG_DIRECTORY_AND_FILE);
        }
    }

}


