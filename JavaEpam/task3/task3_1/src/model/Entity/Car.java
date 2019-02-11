package model.Entity;

public class Car extends KidsToys{
    private String mark;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Car() {
        this("Mark", "Name", 3000, 'b',true);
    }
    public Car(String mark, String name, double price, char sex, boolean status) {
        this.mark = mark;
        super.setName(name);
        super.setPrise(price);
        super.setSex(sex);
        super.setStatus(status);
    }

    public String toString() {
        return super.toString() + " " + mark;
    }


}