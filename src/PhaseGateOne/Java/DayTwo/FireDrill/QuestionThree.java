package PhaseGateOne.Java.DayTwo.FireDrill;

import java.util.Scanner;
public class QuestionThree {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter an integer");
int number = input.nextInt();
if (number % 3 == 0)
    System.out.print("It is divisible");
else
    System.out.print("it is not");

}
}
