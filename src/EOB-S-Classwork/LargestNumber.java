package EOB;

import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int largest = 0;
        for(int count =1; count<=10; count++){
            System.out.print("Enter a number: ");
            int firstNumber = input.nextInt();
            int secondNumber = input.nextInt();
            if (secondNumber > largest){
                largest = secondNumber;
            }
            
        }
    }
}
