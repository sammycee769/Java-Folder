import java.util.Scanner;
public class QuestionFour {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter an integer");
int number = input.nextInt();
if (number < 0)
    System.out.print("It is negative");
if (number >= 0)
    System.out.print("it is positive");

}
}
