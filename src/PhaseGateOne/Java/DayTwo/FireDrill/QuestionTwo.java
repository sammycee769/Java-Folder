import java.util.Scanner;
public class QuestionTwo {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter an integer");
int first_integer = input.nextInt();
System.out.println("Enter an integer");
int second_integer = input.nextInt();
System.out.println("Enter an integer");
int third_integer = input.nextInt();

int sum_of_integers = first_integer+ second_integer+third_integer;

int average = sum_of_integers /3;

int product = first_integer * second_integer*third_integer;

int smallest=first_integer;
int largest=first_integer;

if (second_integer > largest)
    largest=second_integer; 
else if(third_integer>largest)
    largest=third_integer;

if (second_integer < smallest)
    smallest=second_integer;
else if (third_integer>smallest)
    smallest=third_integer ;

System.out.printf("the sumof integers are %d average is %d product is %d the smallest is %d and largest %d ",sum_of_integers,average,product,smallest,largest);
}
}
