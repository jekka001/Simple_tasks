package model;

import java.util.Random;

public class MatrixModel {
    private int value;
    private int[][] matrix;
    private int[][] gotMatrix;
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int[][] getMatrix(){return matrix;}

    public int[][] getGotMatrix(){return gotMatrix;}

    public void setMatrix(int[][] matrix)
    {
        this.matrix = matrix;
    }

    public void setGotMatrix(int[][] gotMatrix)
    {
        this.gotMatrix = gotMatrix;
    }

    public MatrixModel()
    {
        this(5);
    }

    public MatrixModel(int value) {
        this.value = value;
        this.matrix = new int[value][value];
        this.gotMatrix = new int[value][value];
    }

    public int[][] creationMatrix() {
        Random random = new Random();
        for(int row = 0; row < value; row++) {
            for(int col = 0; col < value; col++) {
                matrix[col][row] = random.nextInt();
            }
        }
        return matrix;
    }

    public int[][] takeOverMatrix() {
        for(int row = 0; row < value; row++) {
            for(int col = 0; col < value; col++) {
                gotMatrix[value - 1 - col][row] = matrix[row][col];
            }
        }
        return gotMatrix;
    }

}