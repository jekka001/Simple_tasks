package main;

import model.Model;
import testEnum.Test;

public class Main {
    public static void main(String[] args){
        Model model = Model.values()[1];
        Test text = Test.values()[1];
        System.out.println("Standart Enum:");
        System.out.println("values = " + Test.values());
        System.out.println("valueOf = " + Test.valueOf("CONST_ONE"));
        System.out.println("name = " + text.name());
        System.out.println("ordinal = " + text.ordinal());
        System.out.println("toString = " + text.toString());
        System.out.println("compareTo = " + text.compareTo(Test.CONST_TWO));
        System.out.println("getDeclaringClass = " + text.getDeclaringClass());
        System.out.println("hashCode = " + text.hashCode());
        System.out.println("equals = " + text.equals(Test.CONST_THREE));
        System.out.println("getClass = " + text.getClass());
        System.out.println("My Enum: ");
        System.out.println("values = " + Model.values());
        System.out.println("valueOf = " + Model.valueOf("CONST_ONE"));
        System.out.println("name = " + model.name());
        System.out.println("ordinal = " + model.ordinal());
        System.out.println("toString = " + model.toString());
        System.out.println("compareTo = " + model.compareTo(Model.CONST_TWO));
        System.out.println("getDeclaringClass = " + model.getDeclaringClass());
        System.out.println("hashCode = " + model.hashCode());
        System.out.println("equals = " + model.equals(Model.CONST_THREE));
        System.out.println("getClass = " + model.getClass());

    }
}
