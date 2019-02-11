package model.entity;

import model.entity.typeWagon.TypeWagon;

/**
 * @author Zagrebelnyi Evgeniy
 * This class describes the object of a train wagon
 * @see Comparable
 */
public abstract class Wagon implements Comparable {
    private int weight;
    private int length;
    private double lifetime;
    private TypeWagon typeWagon;

    public int getWeight() { return weight; }

    public void setWeight(int weight) { this.weight = weight; }

    public int getLength() { return length; }

    public void setLength(int length) { this.length = length; }

    public double getLifetime() { return lifetime; }

    public void setLifetime(double lifetime) { this.lifetime = lifetime; }

    public TypeWagon getTypeWagon() { return typeWagon; }

    public void setTypeWagon(TypeWagon typeWagon) { this.typeWagon = typeWagon; }

    /**
     * Empty constructor for the object initialize
     */
    public Wagon(){
        this(0,0, 0,TypeWagon.values()[0]);
    }

    /**
     * constructor for the object initialize with parameters
     * @param weight - weight wagon
     * @param length - length wagon
     * @param lifetime - time that you can use a wagon
     * @param typeWagon - type wagon
     */
    public Wagon(int weight, int length, double lifetime, TypeWagon typeWagon){
        this.weight = weight;
        this.length = length;
        this.lifetime = lifetime;
        this.typeWagon = typeWagon;
    }

    /**
     * method return type wagon
     * @return class wagon
     */
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    /**
     * method compares wagon type
     * @param o - wagon
     * @return -1, 1 or 0 if (this wagon) >, < , = (o wagon)
     */
    @Override
    public int compareTo(Object o) {
        if(this.typeWagon.ordinal() > ((Wagon) o).typeWagon.ordinal()) return 1;
        if(this.typeWagon.ordinal() < ((Wagon) o).typeWagon.ordinal()) return -1;
        return 0;
    }
}
;