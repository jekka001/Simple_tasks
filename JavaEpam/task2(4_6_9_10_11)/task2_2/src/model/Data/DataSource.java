package model.Data;

import model.Entity.Circle;
import model.Entity.Rectangle;
import model.Entity.Shape;
import model.Entity.Triangle;

public class DataSource {
    public static Shape[] getShape(){
        return new Shape[]{
                new Triangle(3,4,5,"Black"),
                new Rectangle(5,3,"Red"),
                new Circle(6,"Blue"),
                new Circle(4,"Green"),
                new Rectangle(7,6,"Red"),
                new Triangle(9,6,4,"Blue"),
                new Rectangle(4,7,"Black"),
                new Circle(8,"Black"),
                new Triangle(3,5,5,"Green"),
                new Rectangle(5,5,"Red")
        };
    }
}

