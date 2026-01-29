import java.util.Scanner;
public class QuestionOne {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter an integer");
int firstNumber = input.nextInt();
System.out.println("Enter an integer");
int secondNumber = input.nextInt();
//System.out.println("Enter an integer");
//int thirdNumber = input.nextInt();

int first_integer_squared = firstNumber * firstNumber;
int second_integer_squared = secondNumber * secondNumber;

int sum_squared = first_integer_squared + second_integer_squared;
int difference_of_squares = first_integer_squared - second_integer_squared;

System.out.printf("The square of: %d is %d and %d is %d, the sumof their squares is %d while the difference is %d ",firstNumber,first_integer_squared,secondNumber,second_integer_squared,sum_squared,difference_of_squares);
}
}
