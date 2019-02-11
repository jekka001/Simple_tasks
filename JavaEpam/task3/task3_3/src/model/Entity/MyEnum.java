package model.Entity;

import java.io.Serializable;

public  abstract class MyEnum implements Comparable,Serializable {

    private final String name;
    private final int ordinal;

    protected MyEnum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public final String name(){
        return name;
    }

    public final int ordinal(){
        return ordinal;
    }

    public String toString(){
        return name;
    }

    public boolean equals(Object other){
        return this == other;
    }

    public final int hashCode(){
        return super.hashCode();
    }

    protected final Object clone()throws CloneNotSupportedException{throw new CloneNotSupportedException();}

    public final int compareTo(Object o){
        if(((MyEnum) o).ordinal() > this.ordinal()) return -1;
        if(((MyEnum) o).ordinal() < this.ordinal()) return 1;
        return 0;
    }

    public final Class getDeclaringClass(){
        return getClass();
    }


    public static MyEnum valueOf(MyEnum[] myEnum, String name){
        if (name != null) {
            for (int i = 0; i < myEnum.length; i++) {
                if (myEnum[i].name.equalsIgnoreCase(name)) {
                    return myEnum[i];
                }
            }
        }
        return null;
    }

    @Override
    protected void finalize(){

    }

}