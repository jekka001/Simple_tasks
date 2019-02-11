package model.entity.typeWagon;

import model.entity.Wagon;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Zagrebelnyi Evgeniy
 * This class describes the object of a train passenger wagon
 * @see Wagon
 */
public abstract class Passenger extends Wagon {
    private int numberSeats;
    private double ticketPrice;
    private Map<Integer,Boolean> employment;

    public int getNumberSeats() { return numberSeats; }

    public void setNumberSeats(int numberSeats) { this.numberSeats = numberSeats; }

    public double getTicketPrice() { return ticketPrice; }

    public void setTicketPrice(double ticketPrice) { this.ticketPrice = ticketPrice; }

    public Map<Integer, Boolean> getEmployment() { return employment; }

    public void setEmployment(Map<Integer, Boolean> employment) { this.employment = employment; }

    /**
     * Empty constructor for the object initialize
     */
    public Passenger(){
        this(0,0,0,TypeWagon.values()[0],0,0,new LinkedHashMap<>());
    }

    /**
     *constructor for the object initialize with parameters
     * @param weight - weight wagon
     * @param length - length wagon
     * @param lifetime - time that you can use a wagon
     * @param typeWagon - type wagon
     * @param numberSeats - number of seats in the wagon
     * @param ticketPrice - price for a place in a wagon
     * @param employment - a map of the busy and free places
     */
    public Passenger(int weight, int length, double lifetime, TypeWagon typeWagon, int numberSeats, double ticketPrice, Map<Integer,Boolean> employment){
        super(weight,length, lifetime,typeWagon);
        this.numberSeats = numberSeats;
        this.ticketPrice = ticketPrice;
        this.employment = check(numberSeats,employment);
    }

    /**
     * method checks that the number of seats in the carriage is greater than the size of the array of data
     * @param numberSeats - number of seats in the wagon
     * @param employment - a map of the busy and free places
     * @return if number < employment return map else null
     */
    private Map<Integer,Boolean> check(int numberSeats,Map<Integer,Boolean> employment){
        if(numberSeats < employment.size())
            return null;
        else
            return employment;
    }

    /**
     * method for determining occupied places
     * @return occupied places in wagon
     */
    public double busyPlaces(){
        double result = 0;
        for(Map.Entry<Integer, Boolean> map : employment.entrySet())
            if(!map.getValue())
                result +=1;
        return result;
    }

    /**
     * method for determining free places
     * @return free places in wagon
     */
    public double freePlaces(){
        return numberSeats - employment.size();
    }

    /**
     * method for buying places
     * @param placeNumber - number place in wagon
     * @return or not occupy this place false if yes, true if not.
     */
    public boolean buyPlace(int placeNumber){
        if(checkPlace(placeNumber)) {
            if (employment.get(placeNumber))
                employment.put(placeNumber, false);
            else
                return false;
            return true;
        }
        else
            return false;
    }
    /**
     * method for free up places
     * @param placeNumber - number place in wagon
     */
    public void freeUpPlace(int placeNumber){
        if(checkPlace(placeNumber))
            employment.put(placeNumber,true);
    }

    /**
     * method for check if there is such a place in the wagon
     * @param placeNumber - number place in wagon
     * @return true if place exist, else false
     */
    public boolean checkPlace(int placeNumber){
        if (placeNumber < numberSeats)
            return true;
        else
            return false;
    }

}
