package model;

import model.entity.Wagon;


/**
 * @author Zagrebelnyi Evgeniy
 * This class describes the object of a train
 */
public class Train<T extends Wagon> {
    private int maxNumberWagon;
    private Wagon[] wagons;

    public int getMaxNumberWagon() { return maxNumberWagon; }

    public void setMaxNumberWagon(int maxNumberWagon) { this.maxNumberWagon = maxNumberWagon; }

    public Wagon[] getWagons() { return wagons; }

    public void setWagons(Wagon[] wagons) { this.wagons = wagons; }

    /**
     * Empty constructor for the object initialize
     */
    public Train() {
        this(0,new Wagon[]{});
    }

    /**
     * constructor for the object initialize with parameters
     * @param maxNumberWagon - maximum number of wagon
     * @param wagons - wagons attached to the train
     */
    public Train(int maxNumberWagon, Wagon[] wagons) {
        this.maxNumberWagon = maxNumberWagon;
        this.wagons = checkWagon(maxNumberWagon,wagons);
    }

    /**
     * method for checking number of train wagon
     * @param maxNumberWagon - maximum number of wagon
     * @param wagons - wagons attached to the train
     * @return wagons if wagons < max number of wagon, else false
     */
    public Wagon[] checkWagon(int maxNumberWagon, Wagon[] wagons){
        if(wagons.length < maxNumberWagon)
            return wagons;
        else
            return null;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ wagons.toString();
    }
}
