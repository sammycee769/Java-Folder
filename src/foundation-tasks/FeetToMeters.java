package foundation;

import java.util.Scanner;
public class FeetToMeters{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a value in feet");
double feet = input.nextDouble();
double feetInMeters = feet * 0.305;
System.out.printf("%f feet in meters is %f", feet,feetInMeters);
}
}
