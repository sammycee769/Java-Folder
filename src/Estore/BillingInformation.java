package Estore;

public class BillingInformation {
    private CreditCard creditCard;
    private String receiverPhoneNumber;
    private String receiverName;
    private DeliveryAddress deliveryAddress;

    public BillingInformation(String receiverPhoneNumber, String receiverName) {
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.receiverName = receiverName;

    }
}
