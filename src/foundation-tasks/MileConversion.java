package foundation;

import java.util.Scanner;
public class MileConversion{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter miles");
int miles = input.nextInt();
double kilometers = miles * 1.6;
System.out.printf("%d miles in %f kilometers", miles,kilometers);
}
}
