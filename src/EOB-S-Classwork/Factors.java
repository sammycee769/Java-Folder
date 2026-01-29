package EOB;

public class Factors {
public static void main(String[]args){
System.out.print(perfectNumber(28));
}

public static boolean perfectNumber(int number){
if( number == factorsOf(number))
return true;

else{
return false;}
}
public static int factorsOf(int number){
int counter = 0;
for (int count = 1; count < number ; count++){
    if (number % count == 0 ){
counter+= count; 
}
}
return counter;
}
}
