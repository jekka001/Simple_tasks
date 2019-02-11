package model.entity.typeWagon.freight;

import model.entity.typeWagon.Freight;
import model.entity.typeWagon.TypeWagon;

/**
 * @author Zagrebelnyi Evgeniy
 * This class describes the object of a train platforms wagon
 * @see Freight
 */
public class Platforms extends Freight {
    private String model;

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    /**
     * Empty constructor for the object initialize
     */
    public Platforms(){
        this("model",0,0,0,0,0);
    }


    /**
     * constructor for the object initialize with parameters
     * @param model - wagon model
     * @param weight - weight model
     * @param length - length model
     * @param lifetime - time that you can use a wagon
     * @param loadingWagon - indicates the capacity of the wagon
     * @param goodsInWagon - indicates the occupancy of the wagon
     */
    public Platforms(String model, int weight, int length, double lifetime, int loadingWagon, int goodsInWagon){
        super(weight,length,lifetime,TypeWagon.WAGON_PLATFORMS,loadingWagon,goodsInWagon);
        this.model = model;
    }
}
