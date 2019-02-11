package model.Entity;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public double getA() { return a; }

    public double getB() { return b; }

    public double getC() { return c; }

    public void setA(double a) { this.a = a; }

    public void setB(double b) { this.b = b; }

    public void setC(double c) { this.c = c; }

    public Triangle() {
        this(6,4,5,"yellow");
    }

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public double calcArea() {
        double p = a+b+c;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return super.toString() + " sideA = " + a + ", sideB = " + b + ", sideC = " + c + ", Color = " + super.getShapeColor();
    }
}

