package model.entity.typeWagon.passenger;

import model.entity.typeWagon.Passenger;
import model.entity.typeWagon.TypeWagon;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Zagrebelnyi Evgeniy
 * class Coupe extends Passenger.
 * The object points to a passenger wagon type coupe.
 * @see Passenger
 */

public class Coupe extends Passenger {
    private String model;

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    /**
     * Empty constructor for the object initialize
     */
    public Coupe(){
        this("model", 0, 0, 0, 0, 0, new LinkedHashMap<>());
    }

    /**
     * constructor for the object initialize with parameters
     * @param model - wagon model
     * @param weight - weight wagon
     * @param length - length wagon
     * @param lifetime - time that you can use a wagon
     * @param numberSeats - number of seats in the wagon
     * @param ticketPrice - price for a place in a wagon
     * @param employment - a map of the busy and free places
     */
    public Coupe(String model, int weight, int length, double lifetime, int numberSeats, int ticketPrice, Map<Integer,Boolean> employment){
        super(weight, length, lifetime, TypeWagon.WAGON_COUPE, numberSeats, ticketPrice, employment);
        this.model = model;
    }

}
