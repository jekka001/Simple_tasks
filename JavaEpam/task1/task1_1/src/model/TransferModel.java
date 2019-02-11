package model;

public class TransferModel {
    private int value;
    private int system;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSystem() {
        return system;
    }

    public void setSystem(int system) {
        this.system = system;
    }

    public TransferModel() {
        this(0,10);
    }

    public TransferModel(int value,int system) {
        this.value = value;
        this.system = system;
    }

    public String transferSystem() {
        int numberForOperation = value;
        StringBuilder result = new StringBuilder();
        while(numberForOperation != 0) {
            if (system!=16)
                result.insert(0, numberForOperation % system);
            else
                result.insert(0,forHexadecimalSystem(numberForOperation));

            numberForOperation /= system;
        }
        return result.toString();
    }

    public String forHexadecimalSystem(int number) {
        switch (number) {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
            default:
                return String.valueOf(number);
        }
    }
}