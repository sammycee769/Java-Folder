package Estore;

import java.util.ArrayList;
import java.util.List;

public class Customers extends Users{
    List<BillingInformation> billingInformation = new ArrayList<BillingInformation>();


    public Customers(int age, String name, String emailAddress, String homeAddress, String password, String phoneNumber) {
        super(age, name, emailAddress, homeAddress, password, phoneNumber);
    }
}
