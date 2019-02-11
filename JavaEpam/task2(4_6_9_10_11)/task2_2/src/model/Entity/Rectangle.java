package model.Entity;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public double getA() { return a; }

    public double getB() { return b; }


    public void setA(double a) { this.a = a; }

    public void setB(double b) { this.b = b; }

    public Rectangle() {
        this(5,5,"pink");
    }

    public Rectangle(double a, double b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public double calcArea()
    {
        return a*b;
    }

    @Override
    public String toString() {
        return super.toString() + " sideA = " + a +", sideB = " + b + ", Color = " + super.getShapeColor();
    }

    @Override
    public int compare(Object o1, Object o2) {
        Shape area1 = (Shape)o1;
        Shape area2 = (Shape)o2;
        if(area1.calcArea() < area2.calcArea()) return -1;
        if(area1.calcArea() > area1.calcArea()) return 1;
        return 0;
    }
}

