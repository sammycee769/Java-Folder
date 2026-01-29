package foundation;

import java.util.Scanner;
public class NumberOfYears{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter number of minutes");
int yearsInMinutes = input.nextInt();
int years = yearsInMinutes / 525600;
int days = (yearsInMinutes % 525600) / 1440;
System.out.printf("%d minutes is approximately %d years and %d days%n", yearsInMinutes,years,days);
}
}
