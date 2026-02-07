package Estore;

public class CreditCard {
    private int Cvv;
    private CardType cardType;
    private String cardNumber;
    private String expiryDate;
    private String name;

    public  CreditCard(int cvv,String cardNumber, String expiryDate, String name) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.name = name;
        this.Cvv = cvv;
    }
}
