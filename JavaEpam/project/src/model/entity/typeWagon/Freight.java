package model.entity.typeWagon;

import model.entity.Wagon;

/**
 * @author Zagrebelnyi Evgeniy
 * This class describes the object of a train freight wagon
 * @see Wagon
 */
public abstract class Freight extends Wagon {
    private double loadingWagon;
    private double goodsInWagon;

    public double getLoadingWagon() { return loadingWagon; }

    public void setLoadingWagon(double loadingWagon) { this.loadingWagon = loadingWagon; }

    public double getGoodsInWagon() { return goodsInWagon; }

    public void setGoodsInWagon(double goodsInWagon) { this.goodsInWagon = goodsInWagon; }

    /**
     * Empty constructor for the object initialize
     */
    public Freight(){
        this(0,0,0,TypeWagon.values()[0],0,0);
    }

    /**
     * constructor for the object initialize with parameters
     * @param weight - weight wagon
     * @param length - length wagon
     * @param lifetime - time that you can use a wagon
     * @param typeWagon - type wagon
     * @param loadingWagon - indicates the capacity of the wagon
     * @param goodsInWagon - indicates the occupancy of the wagon
     */
    public Freight(int weight, int length, double lifetime, TypeWagon typeWagon, double loadingWagon, double goodsInWagon){
        super(weight, length, lifetime, typeWagon);
        this.loadingWagon = loadingWagon;
        this.goodsInWagon = goodsInWagon;
    }

    /**
     * method for determining free space
     * @return free space in wagon
     */
    public double freeSpace(){
        return loadingWagon - goodsInWagon;
    }

}
