package EOB;

public class PerfectNumber {



public static void main(String[]args){
System.out.print(perfectNumber(496));
}
public static boolean perfectNumber(int number){
if( number == sumOfFactors(number))
return true;

else{
return false;}
}

public static int sumOfFactors(int number){

if(number < 1){
return 0;}
if (number == 1) 
return 1;
int sumOfFactors = 0;
int factors = 2;

while (number != 1){

if (number % factors != 0){
factors ++;
}
else{
sumOfFactors += factors;
number /= factors;
}



}

return sumOfFactors;
}


}

