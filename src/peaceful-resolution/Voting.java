package peaceful;

import java.util.Scanner;
public class Voting{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter your age");
int age = input.nextInt();
if (age < 18){
System.out.println("You are ineligible to vote");
}else {
System.out.print("You are eligible to vote");
}
}
}
