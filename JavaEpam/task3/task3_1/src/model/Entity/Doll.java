package model.Entity;

public class Doll extends KidsToys {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Doll() {
        this("Doll",500,'u',true,1.5);
    }
    public Doll(String name, double price, char sex, boolean status,double height) {
        super.setName(name);
        super.setPrise(price);
        super.setSex(sex);
        super.setStatus(status);
        this.height = height;
    }

    public String toString()
    {
        return super.toString() + " height = " + height;
    }
}

