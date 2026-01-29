package foundation;

import java.util.Scanner;
public class PoundsConverter{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter weight in pounds");
double weight = input.nextDouble();
double weightInKilogram = weight * 0.454;
System.out.printf("Your weight in kilograms is %f",weightInKilogram); 
}
}
