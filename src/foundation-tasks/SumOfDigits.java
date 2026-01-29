package foundation;

import java.util.Scanner;
public class SumOfDigits{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a number between 0 and 1000");
int number = input.nextInt();
int firstDigit = number / 100;
int secondDigit =(number / 10) %10;
int thirdDigit = number % 10;
int sumOfDigits = firstDigit + secondDigit + thirdDigit;
if(number > 0 && number <= 999){
System.out.printf("the sum of digits are %d", sumOfDigits);
}else{
System.out.print("enter a number between 0 and 1000");
}
}
}
