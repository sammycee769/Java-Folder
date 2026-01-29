package EOB;

public class SumOfDigits {



public static void main(String[]args){
System.out.print(perfectNumber(153));
}
public static boolean perfectNumber(int number){
if( number == armstrongNumber(number))
return true;

else{
return false;}
}
public static boolean spyNumber(int number){
if( addNumbers(number) == (number * number))
return true;

else{
return false;}
}
public static boolean nivenNumber(int number){
if(number % addNumbers(number) == 0)
return true;

else{
return false;}
}
public static int addNumbers(int number){
int sumOfDigits = 0;
while  (number != 0){
sumOfDigits += number % 10;
number/= 10;
}
return sumOfDigits;
}

public static int reverseNumber(int number){
int reversed = 0;
while (number > 0) {
            int digit = number % 10;       
             reversed = reversed * 10 + digit; 
            number/= 10;          
        }
return reversed;
}
public static int armstrongNumber(int number){
int reversed = 0;
int sumOfCube = 0;
int cube = 1;
while (number > 0) {
            int digit = number % 10;       
             reversed = reversed * 10 + digit; 
            cube = digit * digit * digit;
            sumOfCube += cube;
            number/= 10;          
        }
return sumOfCube;
}
}

