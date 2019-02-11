package view;

import model.Shop;

public class View {
    public static final String MENU = "Choose action: \n" +
            "1: Create Department \n"+
            "2: Delete Department \n"+
            "3: Sorted Department \n"+
            "4: Goods Supply \n"+
            "0: Exit \n";
    public static final String WRONG_INPUT = "Wrong Input! ";
    public static final String INPUT_INT = "Please enter number : \n";
    public static final String INPUT_DATE = "Enter department date(Name, TypeProduct, Services, Location) : \n";
    public static final String DELETE = "Select the department you want to delete : \n";
    public static final String ADD = "Select the department in which to deliver the goods: \n";
    public static final String NOT_DEPARTMENT = "Please create department \n";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printShop(String message, Shop.Department[] departments) {
        System.out.println(message);
        for(Shop.Department department:departments)
            System.out.println(department);
    }
    public void printNumberDepartment(Shop.Department[] departments) {
        int count = 0;
        for(Shop.Department department : departments)
            System.out.println(count++ + " " + department);
    }

}
