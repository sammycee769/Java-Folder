package foundation;

import java.util.Scanner;
public class MonthlyInterest{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the balance");
double balance = input.nextDouble();
System.out.println("enter the annual interest rate");
double rate = input.nextDouble();
double interest = balance * (rate / 1200);
System.out.printf("The interest is %f",interest);
}
}
