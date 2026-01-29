package foundation;

import java.util.Scanner;
public class Acceleration{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the initial velocity in meters per second");
double initialVelocity = input.nextDouble();
System.out.println("Enter the ending velocity in meters per second");
double finalVelocity = input.nextDouble();
System.out.println("Enter the time span second");
int time = input.nextInt();
double acceleration = (finalVelocity - initialVelocity) / time;
System.out.printf("the average acceleratin covered is %f%n", acceleration);

}
}
