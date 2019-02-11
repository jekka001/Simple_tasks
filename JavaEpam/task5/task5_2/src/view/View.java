package view;

import java.util.List;
import java.util.Set;

public class View {
    public final static String INPUT_LENGTH = "Please enter length: \n";
    public final static String INPUT_MIN = "Please enter min value: \n";
    public final static String INPUT_MAX = "Please enter max value: \n";
    public final static String WRONG_LENGTH ="Length must be > 0 ";
    public final static String WRONG = "Max value must be > Min value ";
    public final static String WRONG_FILL_SET = "Small range to fill set \n";

    public static void printMessage(String message){
        System.out.print(message);
    }

    public static void printList(List<Integer> list){
        printMessage("List: ");
        for(int i : list)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void printSet(Set<Integer> set){
        printMessage("Set: ");
        for(int i : set)
            System.out.print(i + " ");
        System.out.println();
    }

}
