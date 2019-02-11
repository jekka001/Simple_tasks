package model.entity;

public class RecordInJournal {
    private String surname;
    private String name;
    private String birthday;
    private String phoneNumber;
    private String address;

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public RecordInJournal() {
        this("NotName", "NotSurname", "NotBirthday", "NotPhoneNumber", "NotAddress");
    }

    public RecordInJournal(String surname, String name, String birthday, String phoneNumber, String address) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                " surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' ;
    }
}
