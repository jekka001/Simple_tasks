package model.Entity;

import java.util.Comparator;

public class KidsToys implements Comparator {
    private String name;
    private double prise;
    private char sex;
    private boolean status;

    public String getName() {
        return name;
    }

    public double getPrise() {
        return prise;
    }

    public char getSex() {
        return sex;
    }

    public boolean isStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public KidsToys()
    {
        this("Toys",300,'g',true );
    }

    public KidsToys(String name, double prise, char sex, boolean status) {
        this.name = name;
        this.prise = prise;
        this.sex = sex;
        this.status = status;
    }

    public String toString() {
        return getClass().getSimpleName() + " " + name + " prise = " + prise + " sex = " + sex + " status = " + status;
    }

    @Override
    public int compare(Object o1, Object o2) {
        double price1 = ((KidsToys)o1).getPrise();
        double price2 = ((KidsToys)o2).getPrise();
        if(price1 > price2) return -1;
        if(price1 < price2) return 1;
        return 0;
    }
}
