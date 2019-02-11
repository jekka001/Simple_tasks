package model.dataSource;

import model.entity.Wagon;
import model.entity.typeWagon.freight.Coveredwagon;
import model.entity.typeWagon.passenger.*;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Zagrebelnyi Evgeniy
 * This class represents the data to fill
 */
public class DataSource {

    /**
     * method returns the data to initialize the train
     * @return trains wagons
     */
    public static Wagon[] getTrain1(){
        return new Wagon[]{
                new Coupe("WC1030",5000,3000,10,40,300, getList40PlacesInWagon()),
                new General("WG2302",3500,3000,10,50,100, getList50PlacesInWagon()),
                new GeneralWithArmchairs("WGWA2033",4000,3000,10,30,150, getList30PlacesInWagon()),
                new Platscart("WP1505", 4500, 3000, 10, 35, 250, getList35PlacesInWagon()),
                new Coupe("WC3030",5000,3000,5,40,350, getList40PlacesInWagon()),
                new Lux("WL2001", 4000, 3000, 3, 20, 1000, getList20PlacesInWagon()),
                new SV("WSV3000",5000, 3000, 7, 30, 500, getList30PlacesInWagon()),
                new General("WG2352",3500,3000,4,50,150, getList50PlacesInWagon()),
                new GeneralWithArmchairs("WGWA2133",5000,3000,10,40,150, getList40PlacesInWagon()),
                new Platscart("WP1505", 4500, 3000, 10, 35, 300, getList35PlacesInWagon()),
                new Coveredwagon(30,"WC3003", 5000, 3000, 10, 30, 20),
                new Coveredwagon(50,"WC3013", 5000, 3000, 10, 50, 50)
        };
    }

    /**
     * method for initialize places in the wagon
     * @return 40 places in the wagon
     */
    private static Map<Integer,Boolean> getList40PlacesInWagon(){
        Map<Integer, Boolean> map = new LinkedHashMap<Integer, Boolean>();
        for(int i = 0; i < 40; i++)
            if(i % 2 == 0)
                map.put(i,false);
            else
                map.put(i,true);
        return map;
    }



    private static Map<Integer,Boolean> getList50PlacesInWagon(){
        Map<Integer, Boolean> map = new LinkedHashMap<Integer, Boolean>();
        for(int i = 0; i < 50; i++)
            if(i % 2 == 0)
                map.put(i,false);
            else
                map.put(i,true);
        return map;
    }

    private static Map<Integer,Boolean> getList30PlacesInWagon(){
        Map<Integer, Boolean> map = new LinkedHashMap<Integer, Boolean>();
        for(int i = 0; i < 30; i++)
            if(i % 2 == 0)
                map.put(i,false);
            else
                map.put(i,true);
        return map;
    }

    private static Map<Integer,Boolean> getList35PlacesInWagon(){
        Map<Integer, Boolean> map = new LinkedHashMap<Integer, Boolean>();
        for(int i = 0; i < 35; i++)
            if(i % 2 == 0)
                map.put(i,false);
            else
                map.put(i,true);
        return map;
    }

    private static Map<Integer,Boolean> getList20PlacesInWagon(){
        Map<Integer, Boolean> map = new LinkedHashMap<Integer, Boolean>();
        for(int i = 0; i < 20; i++)
            if(i % 2 == 0)
                map.put(i,false);
            else
                map.put(i,true);
        return map;
    }

}