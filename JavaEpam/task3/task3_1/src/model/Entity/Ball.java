package model.Entity;

public class Ball extends KidsToys{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ball() {
        this("Ball", 500, 'u',true,"volleyball");
    }
    public Ball(String name, double price, char sex, boolean status, String type) {
        super.setName(name);
        super.setPrise(price);
        super.setSex(sex);
        super.setStatus(status);
        this.type = type;
    }

    public String toString()
    {
        return super.toString() + "type = " + type;
    }
}