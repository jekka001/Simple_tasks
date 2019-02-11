package model.entity.typeWagon.freight;

import model.entity.typeWagon.Freight;
import model.entity.typeWagon.TypeWagon;


/**
 * @author Zagrebelnyi Evgeniy
 * This class describes the object of a train Isothermalwagon wagon
 * @see Freight
 */
public class Isothermalwagon extends Freight {
    private double capacity;
    private String model;

    public double getCapacity() { return capacity; }

    public void setCapacity(double capacity) { this.capacity = capacity; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    /**
     * Empty constructor for the object initialize
     */
    public Isothermalwagon(){
        this(0,"model",0,0,0,0,0);
    }


    /**
     * constructor for the object initialize with parameters
     * @param capacity - volume of goods placed in the wagon
     * @param model - wagon model
     * @param weight - weight model
     * @param length - length model
     * @param lifetime - time that you can use a wagon
     * @param loadingWagon - indicates the capacity of the wagon
     * @param goodsInWagon - indicates the occupancy of the wagon
     */
    public Isothermalwagon(double capacity, String model, int weight, int length, double lifetime, int loadingWagon, int goodsInWagon){
        super(weight,length,lifetime,TypeWagon.WAGON_ISOTHERMALWAGON,loadingWagon,goodsInWagon);
        this.capacity = capacity;
        this.model = model;
    }
}
