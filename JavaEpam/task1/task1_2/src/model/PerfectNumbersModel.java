package model;

public class PerfectNumbersModel {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public PerfectNumbersModel() {
        this(7);
    }

    public PerfectNumbersModel(int value) {
        this.value = value;
    }

    public String searchPerfectNumbers() {
        StringBuilder resultMas = new StringBuilder();
        for(int number = 2; number <= value; number++) {
            if(check(number)) {
                if(resultMas.length()!=0)
                    resultMas.append(',');
                resultMas.append(number);
            }

        }
        return resultMas.toString();
    }

    public boolean check(int number) {
        int sum = 1;
        int numberForOperation = number;
        for(int count = 2 ; count < numberForOperation; count++) {
            if(number % count == 0) {
                sum += count;
                numberForOperation = number/count;
                sum += numberForOperation;
            }
        }
        return (sum == number);
    }
}
