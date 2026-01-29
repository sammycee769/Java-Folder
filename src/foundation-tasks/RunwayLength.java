package foundation;

import java.util.Scanner;
public class RunwayLength{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter speed");
double speed = input.nextDouble();
System.out.println("Enter acceleration");
double acceleration = input.nextDouble();
double length = (speed * speed) /( 2 * acceleration);
System.out.printf("The minimum runway length for this plane is %f", length);
}
}
