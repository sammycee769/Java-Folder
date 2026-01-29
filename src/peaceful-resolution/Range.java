import java.util.Scanner;
public class Range{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("enter a number");
double number = input.nextDouble();
if (number >= 1 && number <= 100){
System.out.printf("number %f is in range%n",number);
}else{
System.out.printf("number %f is not in range%n", number);
}
}
}
