package foundation;

import java.util.Scanner;
public class ReverseNumber{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a four digit integer");
int number = input.nextInt();
int firstDigit = number / 1000;
int secondDigit =(number / 100) %10;
int thirdDigit = (number % 100) / 10;
int fourthDigit = number % 10;
if(number > 999 && number <= 9999){
System.out.printf("the reversed digit is %d %d %d %d", fourthDigit,thirdDigit,secondDigit,firstDigit);
}else{
System.out.print("enter a four digit integer");
}
}
}
