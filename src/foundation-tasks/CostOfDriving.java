package foundation;

import java.util.Scanner;
public class CostOfDriving{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the distance to travel");
double distance = input.nextDouble();
System.out.println("Enter the fuel efficiency of the car in miles per gallon");
double fuelEfficiency = input.nextDouble();
System.out.println("Enter the price per gallon");
double price = input.nextDouble();
double costOfDriving = (distance / fuelEfficiency)*price;
System.out.printf("the cost of driving is %f", costOfDriving);
}
}
