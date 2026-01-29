import java.util.Scanner;
public class BMI{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter your weight in pounds");
double weight = input.nextDouble();
System.out.println("Enter your height in inches");
double height = input.nextDouble();
double weightInKilogram = weight * 0.45359237;
double heightInMeters = height * 0.0254;
double bmi = weightInKilogram / (heightInMeters * heightInMeters) ;
System.out.printf("BMI is %f", bmi);
}
}
