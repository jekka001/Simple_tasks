package controller;

import model.Train;
import model.WorkWithModel;
import model.dataSource.DataSource;
import model.entity.Wagon;
import view.InputSystem;
import view.View;

/**
 * @author Zagrebelnyi Evgeniy
 * This class connects model and presentation
 */
public class Controller {
    private View view;
    private EnumOperation enumOperation;
    private WorkWithModel workWithModel;
    private Train train;

    public View getView() { return view; }

    public void setView(View view) { this.view = view; }

    public EnumOperation getEnumOperation() { return enumOperation; }

    public void setEnumOperation(EnumOperation enumOperation) { this.enumOperation = enumOperation; }

    public WorkWithModel getWorkWithModel() { return workWithModel; }

    public void setWorkWithModel(WorkWithModel workWithModel) { this.workWithModel = workWithModel; }

    public Train getTrain() { return train; }

    public void setTrain(Train train) { this.train = train; }

    /**
     * Empty constructor for the object initialize
     */
    public Controller() {
        this(new View(), EnumOperation.values()[1], new Train(13, DataSource.getTrain1()));
    }


    /**
     * constructor for the object initialize with parameters
     * @param view - presentation data in the output
     * @param enumOperation - transfer operations
     * @param train - object type Train
     * @see Train
     * @see View
     * @see EnumOperation
     */
    public Controller(View view, EnumOperation enumOperation, Train train) {
        this.view = view;
        this.enumOperation = enumOperation;
        this.workWithModel = new WorkWithModel(train);
        workWithModel.initialize();
        this.train = train;
    }

    /**
     * method for started program
     */
    public void run(){
        menu();
    }

    /**
     * method presentation menu for program
     */
    private void menu(){
        while(true){
            view.printWagon("Train 1: ",train.getWagons());
            view.printMessage(view.MENU);
            enumOperation = EnumOperation.values()[InputSystem.inputIntMenu(view)];
            switch (enumOperation) {
                case TOTAL_NUMBER_OF_PASSANGER:
                    view.printNumber("The total number of passenger in the train = ", workWithModel.numberPassengers());
                    break;
                case TOTAL_AMOUNT_OF_BAGGAGE:
                    view.printNumber("The total amount of baggage(kg) = ", workWithModel.numberBaggage());
                    break;
                case SORTING_OF_WAGON_BY_TYPE:
                    workWithModel.sortedByTypeWagon();
                    view.printWagon("Sorting of wagon : ", train.getWagons());
                    break;
                case FIND_WAGON_WITH_NUMBER_PASSANGER:
                    int number = InputSystem.inputIntNumberPassengers(view);
                    checkForZero( workWithModel.searchNumberPassenger(number));
                    break;
                case EXIT:
                    return;
            }
        }
    }
    private void checkForZero(Wagon[] wagon){
        if(wagon.length == 0){
            view.printMessage("Wagon with such number of passengers were not found");
        }
        else
            view.printWagon("Find a wagon: ", wagon);
    }
}
