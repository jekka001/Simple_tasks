package model.Data;

import model.Entity.Ball;
import model.Entity.Car;
import model.Entity.Doll;
import model.Entity.KidsToys;

public class DataSource {
    public static KidsToys[] getToys(){
        return new KidsToys[] {
                new Car("BMV","X6",300,'b',true),
                new Doll("Barbi",700,'g',true,130),
                new Ball("Mikasa",500,'u',false,"volleyball"),
                new Ball("Mikasa",700,'u',true,"football"),
                new Ball("Extreme",150,'u',true,"basketball"),
                new Car("Audio","A6",700,'b',false),
                new Doll("Sten",1000,'g',false,150)
        };
    }


}
