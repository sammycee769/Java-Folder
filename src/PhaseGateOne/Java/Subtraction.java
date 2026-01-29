package PhaseGateOne.Java;

import java.util.Scanner;
import java.util.Random;
public class Subtraction{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

Random random = new Random();

int sumOfCorrectNumbers=0;
//int firstNumber = random.nextInt(1,20);
//int secondNumber= random.nextInt(21,30);
//int thirdNumber = firstNumber;
int count=0;
int counter=0;
int result;
while(count <= 10){
//if(firstNumber < secondNumber){
//firstNumber = secondNumber;
//secondNumber = thirdNumber;
//}
int firstNumber = random.nextInt(1,20);
int secondNumber= random.nextInt(21,30);
System.out.println(secondNumber + "-" + firstNumber);
int number = input.nextInt();
result = secondNumber - firstNumber;
if(result == number){
sumOfCorrectNumbers+=number;
}
if(result != number){
counter+=1;
}
if(counter ==2){
break;
}
count ++;

}
System.out.print("The total correct answers ="+ sumOfCorrectNumbers);

}
}
