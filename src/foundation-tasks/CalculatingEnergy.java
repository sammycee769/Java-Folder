package foundation;

import java.util.Scanner;
public class CalculatingEnergy{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter amount of water in kilograms");
double waterInKilograms = input.nextDouble();
System.out.println("Enter initial temperature");
double initialTemperature = input.nextDouble();
System.out.println("Enter final temperature");
double finalTemperature = input.nextDouble();
double energy = waterInKilograms * (finalTemperature - initialTemperature) * 4184;
System.out.printf("The energy needed is %f",energy);
}
}
