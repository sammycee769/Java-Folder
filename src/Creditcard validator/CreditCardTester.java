import java.util.Arrays;
import java.util.Scanner;
public class CreditCardTester{
public static void main(String[]args){
Scanner input = new Scanner(System.in); 
System.out.println("Hello, Kindly Enter Card details to Verify");
long userInput= input.nextLong(); 

long [] cardNum = Creditcard.CreditcardFunction.converToArray(userInput);


     System.out.println("**********");
     System.out.println("**Credit Card Type: "+ Creditcard.CreditcardFunction.cardType(cardNum));
     System.out.println("**Credit Card Number: "+userInput);
     System.out.println("**Credit Card Digit Lenght: "+ Creditcard.CreditcardFunction.lengthOfCreditCard(userInput));
     System.out.println("**Credit Card Validity Status: "+ Creditcard.CreditcardFunction.isValid(cardNum));
     System.out.println("**********");
} 

}

