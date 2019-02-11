package model;

import model.Entity.KidsToys;

import java.util.Arrays;

public class Model <T extends KidsToys> {
    private int playRoomNumber;
    private T[] elem;

    public int getPlayRoomNumber() {
        return playRoomNumber;
    }

    public T[] getElem() {
        return elem;
    }

    public void setPlayRoomNumber(int playRoomNumber) {
        this.playRoomNumber = playRoomNumber;
    }

    public void setElem(T[] elem) {
        this.elem = elem;
    }

    public Model(int playRoomNumber)
    {
        this.playRoomNumber = playRoomNumber;
    }

    public T[] sort() {
        Arrays.sort(elem,new KidsToys());
        return elem;
    }

    public double sum() {
        double sum = 0;
        for(T toy : elem)
            sum += toy.getPrise();
        return sum;
    }

    public KidsToys[] search(double price1, double price2) {
        KidsToys[] t = new KidsToys[elem.length];
        int count=0;
        for(T toy : elem)
            if( (toy.getPrise() >= price1) && (toy.getPrise() <= price2) )
                t[count++]= toy;
        t = Arrays.copyOf(t,count);
        return t;
    }

}
