package model;

import model.Entity.MyEnum;

public class Model extends MyEnum {

    public static final Model CONST_ONE = new Model("CONST_ONE",0);
    public static final Model CONST_TWO = new Model("CONST_TWO",1);
    public static final Model CONST_THREE = new Model("CONST_THREE",2);

    private static final Model[] models = new Model[]{
            CONST_ONE,
            CONST_TWO,
            CONST_THREE
    };

    private Model(String name, int ordinal){
        super(name,ordinal);
    }

    public static Model[] values(){
        return models;
    }

    public static Model valueOf(String name){
        for(Model model : models)
            if(model.name().equalsIgnoreCase(name))
                return model;
        throw new IllegalArgumentException();
    }

}