package model.Entity;

public class Circle extends Shape{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(){this(5,"black");}

    public Circle(double r, String color) {
        super(color);
        this.r = r;
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public double calcArea() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public String toString() {
        return super.toString()+" Radius = "+ r +", Color = " + super.getShapeColor();
    }
}
