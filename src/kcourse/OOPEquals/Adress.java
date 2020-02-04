package kcourse.OOPEquals;

public class Adress {

    private String city;
    private String street;
    private int numberOfHouse;

    public Adress(String city, String street, int numberOfHouse) {
        this.city = city;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Adress) {
            Adress adress = (Adress) obj;
            return this.city.equals(adress.city) && this.street.equals(adress.street) && this.numberOfHouse == adress.numberOfHouse;

        } else {
            return false;
        }
    }
}
