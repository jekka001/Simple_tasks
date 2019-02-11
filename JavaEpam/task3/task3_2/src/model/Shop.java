package model;

import java.util.Comparator;

public class Shop implements Comparator {
    private String nameShop;
    private Department[] department;
    private int count;

    public String getNameShop() { return nameShop; }

    public Department[] getDepartment() { return department; }

    public int getCount() { return count; }

    public void setNameShop(String nameShop) { this.nameShop = nameShop; }

    public void setDepartment(Department[] department) { this.department = department; }

    public void setCount(int count) { this.count = count; }

    public Shop(){
        this("Shop");
    }

    public Shop(String nameShop) {
        this.nameShop = nameShop;
        department = new Department[count];
    }

    @Override
    public int compare(Object o1, Object o2) {
        int among1 = ((Department)o1).getAmong();
        int among2 = ((Department)o2).getAmong();
        if(among1 > among2) return -1;
        if(among1 < among2) return 1;
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString(){return getClass().getSimpleName() + " " + nameShop;}

    public static class Department{
        private String nameDepartment;
        private String typeProduct;
        private String services;
        private String location;
        private int among;

        public String getNameDepartment() { return nameDepartment; }

        public String getTypeProduct() { return typeProduct; }

        public String getServices() { return services; }

        public String getLocation() { return location; }

        public int getAmong() {
            return among;
        }

        public void setNameDepartment(String nameDepartment) { this.nameDepartment = nameDepartment; }

        public void setTypeProduct(String typeProduct) { this.typeProduct = typeProduct; }

        public void setServices(String services) { this.services = services; }

        public void setLocation(String location) { this.location = location; }

        public void setAmong(int among) {
            this.among = among;
        }

        public Department() {
            this("Department", "Milk", "Services","Location",30);
        }

        public Department(String nameDepartment, String typeProduct, String services, String location, int among) {
            this.nameDepartment = nameDepartment;
            this.typeProduct = typeProduct;
            this.services = services;
            this.location = location;
            this.among = among;
        }

        @Override
        public String toString() {
            return super.getClass().getSimpleName() + " - " + nameDepartment+ " typeProduct - " + typeProduct + " services - "
                    + services + " location - " + location + " among = " + among;
        }

    }
}
