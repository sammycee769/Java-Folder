package foundation;

import java.util.Scanner;
public class DistanceCovered{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the initial velocity");
double velocity = input.nextDouble();
System.out.println("Enter the time taken");
double time = input.nextDouble();
System.out.println("Enter the acceleration");
double acceleration = input.nextDouble();
double distanceCovered = velocity * time + (0.5 * acceleration * time * time);
System.out.printf("The distance covered is %f",distanceCovered);
}
}
