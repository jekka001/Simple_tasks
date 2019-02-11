package model;

public class PyramidModel {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public PyramidModel()
    {
        this(9);
    }

    public PyramidModel(int value)
    {
        this.value = value;
    }

    public String creationPyramid() {
        StringBuilder result = new StringBuilder();
        for(int row = 1; row <= value; row++) {
            for(int space = value; space > row; space--)
                result.append(' ');
            for (int col = 1; col < row * 2; col++) {
                if (col <= row)
                    result.append(col);
                else
                    result.append((row * 2) - col);
            }
            result.append('\n');
        }
        return result.toString();
    }
}