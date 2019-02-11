package model;

import model.entity.Wagon;
import model.entity.typeWagon.Freight;
import model.entity.typeWagon.Passenger;

import java.util.Arrays;
/**
 * @author Zagrebelnyi Evgeniy
 * This class for work with train
 */
public class WorkWithModel {
    private Train train;
    private Passenger[] passengers;
    private Freight[] freights;
    public Train getTrain() { return train; }

    public void setTrain(Train train) { this.train = train; }

    /**
     * Empty constructor for the object initialize
     */
    public WorkWithModel() { this(new Train()); }

    /**
     * constructor for the object initialize with parameters
     * @param train - train we work with
     */
    public WorkWithModel(Train train) {
        this.train = train;
    }

    public void initialize(){
        passengers = new Passenger[train.getMaxNumberWagon()];
        freights = new Freight[train.getMaxNumberWagon()];
        int countPassenger = 0;
        int countFreight = 0;
        for(Wagon wagon : train.getWagons()) {
            if(wagon instanceof Passenger)
                passengers[countPassenger++] = (Passenger) wagon;
            else if(wagon instanceof Freight)
                freights[countFreight++] = (Freight) wagon;
        }
        passengers = Arrays.copyOf(passengers,countPassenger);
        freights = Arrays.copyOf(freights,countFreight);
    }

    public int numberPassengers(){
        int result = 0;
        for(Passenger passenger : passengers)
            result += passenger.busyPlaces();
        return result;
    }

    public double numberBaggage(){
        double result = 0;
        for(Freight freight : freights)
            result += freight.getGoodsInWagon();
        return result;
    }

    public void sortedByTypeWagon(){
        Arrays.sort(train.getWagons());
    }

    public Passenger[] searchNumberPassenger(int numberPassenger){
        Passenger[] result = new Passenger[passengers.length];
        int count = 0;
        for(Passenger passenger : passengers)
            if(passenger.busyPlaces() == numberPassenger)
                result[count++] = passenger;
        result = Arrays.copyOf(result,count);
        return result;
    }

}
