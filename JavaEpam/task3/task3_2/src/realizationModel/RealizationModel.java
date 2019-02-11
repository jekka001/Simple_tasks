package realizationModel;

import model.Shop;

import java.util.Arrays;

public class RealizationModel {
    private Shop shop;

    public Shop getShop() { return shop; }

    public void setShop(Shop shop) { this.shop = shop; }

    public RealizationModel() { this(new Shop());}

    public RealizationModel(Shop shop) {
        this.shop = shop;
    }

    public void createDepartment(String nameDepartment, String typeProduct, String services, String location) {
        shop.setCount(shop.getCount() + 1);
        Shop.Department department = new Shop.Department(nameDepartment,typeProduct,services,location,0);
        shop.setDepartment(Arrays.copyOf(shop.getDepartment(),shop.getCount()));
        shop.getDepartment()[shop.getDepartment().length-1] = department;

    }


    public void deleteDepartment(int amongDepartment){
        Shop.Department[] departments = new Shop.Department[shop.getCount()];
        int among=0;
        for(int i = 0; i < shop.getDepartment().length; i++)
            if(i != amongDepartment)
                departments[among++] = shop.getDepartment()[i];
        shop.setDepartment(Arrays.copyOf(departments,among));
        shop.setCount(shop.getCount() - 1);
    }

    public void sort() {
        Arrays.sort(shop.getDepartment(),new Shop());
    }
}
