package foundation;

import java.util.Scanner;
public class AreaOfTriangle{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter side one");
double side = input.nextDouble();
System.out.println("Enter side two");
double sideTwo = input.nextDouble();
System.out.println("Enter side three");
double sideThree = input.nextDouble();
double sideS = (side + sideTwo + sideThree) /  2;
double sideSOne = sideS - side;
double sideSTwo = sideS - sideTwo;
double sideSThree = sideS - sideThree;
double areaSquare = sideS * sideSOne * sideSTwo * sideSThree;
double area = Math.sqrt(areaSquare);
System.out.printf("The area of the triangle is %f",area);
}
}
