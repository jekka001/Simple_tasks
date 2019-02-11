package controller;

import model.Data.DataSource;
import model.Entity.Ball;
import model.Entity.Car;
import model.Entity.Doll;
import model.Entity.KidsToys;
import model.Model;
import view.InputSystem;
import view.View;

import java.util.Arrays;

public class Controller  {
    private Model<KidsToys> model;
    private Model<Car> modelCar;
    private Model<Ball> modelBall;
    private Model<Doll> modelDoll;
    private View view;
    private Operation operation;
    private Room room;
    public Controller(){
        this(new View());
    }


    public Controller(View view) {
        model = new Model<KidsToys>(1);
        modelCar = new Model<Car>(2);
        modelBall = new Model<Ball>(3);
        modelDoll = new Model<Doll>(4);
        this.view = view;
        operation = Operation.values()[1];
        room = Room.values()[1];
    }

    public void run() {
        model.setElem(DataSource.getToys());
        fillRoom(model.getElem());
        menuRoom();
    }

    private void menuRoom() {
        while (true) {
            view.printMessage(view.MENU_ROOMS);
            room = Room.values()[InputSystem.inputIntValue(view)];
            switch (room) {
                case ALL_TOYS:
                    view.printMessage("Room all toys: \n");
                    menuTask(model);
                    break;
                case CAR_TOYS:
                    view.printMessage("Room car toys: \n");
                    menuTask(modelCar);
                    break;
                case BALL_TOYS:
                    view.printMessage("Room ball toys: \n");
                    menuTask(modelBall);
                    break;
                case DOLL_TOYS:
                    view.printMessage("Room doll toys: \n");
                    menuTask(modelDoll);
                    break;
                case EXIT:
                    return;
            }
        }
    }

    private void menuTask(Model modelMenu) {
        while(true) {
            view.printToys("Toys: ", (KidsToys[]) modelMenu.getElem());
            view.printMessage(view.MENU_OPERATION);
            operation = Operation.values()[InputSystem.inputIntValue(view)];
            switch (operation) {
                case SORTED_BY_PRICE:
                    view.printToys("Sorted : ", (KidsToys[]) modelMenu.sort());
                    break;
                case ALL_PRICE_TOYS:
                    view.printToys("Price all: ",  modelMenu.sum());
                    break;
                case SEARCH_BY_PRICES:
                    view.printToys("Toys from 300 to 700: ", modelMenu.search(300, 700));
                    break;
                case NOT_OPERATION:
                    view.printMessage("Not Operation");
                    break;
                case EXIT:
                    return;
            }
        }
    }

    private void fillRoom(KidsToys[] toysMain) {
        Car[] toys = new Car[toysMain.length];
        Ball[] toys1 = new Ball[toysMain.length];
        Doll[] toys2 = new Doll[toysMain.length];
        int count = 0, count1 = 0, count2 = 0;
        for(KidsToys toy :  toysMain) {
            if(toy instanceof Car)
                toys[count++] = (Car)toy;
            else if(toy instanceof Ball)
                toys1[count1++] = (Ball)toy;
            else
                toys2[count2++] = (Doll)toy;
        }
        toys = Arrays.copyOf(toys,count);
        modelCar.setElem(toys);
        toys1 = Arrays.copyOf(toys1,count1);
        modelBall.setElem(toys1);
        toys2 = Arrays.copyOf(toys2,count2);
        modelDoll.setElem(toys2);
    }
}
