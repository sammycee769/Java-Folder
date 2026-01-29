package foundation;

import java.util.Scanner;
public class Gratuity{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the subtotal");
int subtotal = input.nextInt();
System.out.println("Enter the gratuity rate");
double rate = input.nextDouble();
double gratuity = rate * 0.1;
double gratuityTotal = subtotal + gratuity;
System.out.printf("The gratuity is $%f and total is $%f",gratuity,gratuityTotal);
}
}
