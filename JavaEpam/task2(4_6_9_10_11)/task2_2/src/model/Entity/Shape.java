package model.Entity;

import java.util.Comparator;

public abstract class Shape implements Drawable, Comparator {
    private String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Shape(){ this("red");}

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public void draw() {
        System.out.println(toString()+ "color = " +shapeColor);
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return super.getClass().getSimpleName();
    }

    @Override
    public int compare(Object o1, Object o2) {
        String color1 = ((Shape)o1).getShapeColor();
        String color2 = ((Shape)o2).getShapeColor();
        return  color1.compareTo(color2);

    }
}
