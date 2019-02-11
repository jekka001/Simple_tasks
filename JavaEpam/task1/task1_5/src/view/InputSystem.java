package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputSystem {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int inputIntValue(MatrixView view)  {
        int number;
        view.printMessage(view.INPUT_INT);
        while(true) {
            try {
                number = Integer.parseInt(reader.readLine());
                if(number > 0)
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

    public static String matrixString(int[][] matrix,int value) {
        StringBuilder matrixString = new StringBuilder();
        for(int countCol = 0; countCol < value; countCol++) {
            for(int elem : matrix[countCol]) {
                matrixString.append(elem);
                matrixString.append(" ");
            }
            matrixString.append("\n");
        }
        return matrixString.toString();
    }

}
