package Estore;

public class DeliveryAddress {
    private String city;
    private String country;
    private String street;
    private String state;
    private int houseNumber;

    public  DeliveryAddress(String city, String country, String street, String state, int houseNumber) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.state = state;
        this.houseNumber = houseNumber;
    }
}
