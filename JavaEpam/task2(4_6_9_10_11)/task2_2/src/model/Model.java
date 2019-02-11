package model;

import controller.Operation;
import model.Entity.Circle;
import model.Entity.Rectangle;
import model.Entity.Shape;
import model.Entity.Triangle;

import java.util.Arrays;

public class Model {
    private Shape[] shapes;
    private Operation operation;

    public Shape[] getShapes() {
        return shapes;
    }

    public Operation getOperation() { return operation; }

    public void setShapes(Shape[] shapes) { this.shapes = shapes; }

    public void setOperation(Operation operation) { this.operation = operation; }

    public Model() {
        this(new Shape[]{},Operation.values()[1]);
    }

    public Model(Shape[] shapes, Operation operation) {
        this.shapes = shapes;
        this.operation = operation;
    }

    public double sumAreaShapes() {
        double sum = 0;
        switch (operation) {
            case ALL_AREA_OF_SHAPE:
                for(Shape shape : shapes)
                    sum += shape.calcArea();
                break;
            case ALL_AREA_OF_TRIANGLE:
                for (Shape shape : shapes)
                    if (shape instanceof Triangle)
                        sum += shape.calcArea();
                break;
            case ALL_AREA_OF_RECTANGLE:
                for (Shape shape : shapes)
                    if (shape instanceof Rectangle)
                        sum += shape.calcArea();
                break;
            case ALL_AREA_OF_CIRCLE:
                for (Shape shape : shapes)
                    if (shape instanceof Circle)
                        sum += shape.calcArea();
                break;
        }
        return sum;
    }

    public Shape[] sortArea() {
        Arrays.sort(shapes,new Rectangle());
        return shapes;
    }
    public Shape[] sortColor() {
        Arrays.sort(shapes,new Triangle());
        return shapes;
    }
}
