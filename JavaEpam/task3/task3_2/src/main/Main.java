package main;

import controller.Controller;
import view.View;

public class Main {
    public static void main(String[] args){
        new Controller(new View()).run();
    }
}
