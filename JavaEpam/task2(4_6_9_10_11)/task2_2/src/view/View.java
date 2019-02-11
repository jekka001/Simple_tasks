package view;

import model.Entity.Shape;

public class View {
    public static final String MENU ="Choose operation:\n " +
            "1: The sum of all area of Shapes \n" +
            "2: The sum of all area of given type(Triangle) \n" +
            "3: The sum of all area of given type(Rectangle) \n" +
            "4: The sum of all area of given type(Circle) \n" +
            "5: Sorted shapes by area \n" +
            "6: Sorted shapes by color \n" +
            "0: Exit \n";
    public static final String INPUT_INT = "Please enter number = ";
    public static final String WRONG_INPUT = "Wrong input! Repeat please! ";

    public void printShape(String message, Shape[] shapes) {
        System.out.println(message);
        for(Shape shape : shapes)
            System.out.println(shape);
    }
    public void printShapeArea(String message, double shapes)
    {
        System.out.println(message+shapes);
    }
    public void printMessage(String message){
        System.out.println(message);
    }
}
