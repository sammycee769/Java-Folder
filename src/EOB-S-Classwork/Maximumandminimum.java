package EOB;

import java.util.Scanner;
public class Maximumandminimum{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.print("Input an integer: ");
int firstNumber = input.nextInt();
System.out.print("Input another integer: ");
int secondNumber = input.nextInt();
System.out.print("Input another integer: ");
int thirdNumber = input.nextInt();
System.out.print("Input another integer: ");
int fourthNumber = input.nextInt();
System.out.print("Input another integer: ");
int fifthNumber = input.nextInt();

int largestNumber = 0;
int smallestNumber = firstNumber;


if(firstNumber > largestNumber){
largestNumber = firstNumber;
} 
if(secondNumber > largestNumber){
largestNumber = secondNumber;
}
if(thirdNumber > largestNumber){
largestNumber = thirdNumber;
}
if(fourthNumber > largestNumber){
largestNumber = fourthNumber;
} 
if(fifthNumber > largestNumber){
largestNumber = fifthNumber;
}


//if(smallestNumber < firstNumber){
//smallestNumber = firstNumber;
//}
if(secondNumber < smallestNumber){
smallestNumber = secondNumber;
}
if(thirdNumber < smallestNumber){
smallestNumber = thirdNumber;
} 
if(fourthNumber < smallestNumber){
smallestNumber = fourthNumber;
} 
if(fifthNumber < smallestNumber){
smallestNumber= fifthNumber;
}

System.out.printf("%d is your largest Number while %d is the smallest",largestNumber,smallestNumber);
}
}
