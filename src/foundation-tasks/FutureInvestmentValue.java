package foundation;

import java.util.Scanner;
public class FutureInvestmentValue{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter investment amount");
double amount = input.nextDouble();
System.out.println("Enter annual Interest rate in percentage ");
double interestRate = input.nextDouble();
System.out.println("Enter number of years");
int years = input.nextInt();
double monthlyInterestRate = interestRate /1200;
double value = (1 + monthlyInterestRate);
double time = years * 12;
double futureInvestmentValue = amount * Math.pow(value,time);
System.out.printf("Your accumulated value is %f",futureInvestmentValue);
}
}
