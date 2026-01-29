package Opes;

public class Multiplication{
public static void main(String...args){
System.out.print(muliply(2,3));
}
public static int muliply(int firstNumber, int secondNumber){
int total = 0;
for(int count=1; count <= secondNumber ;count++){
total += firstNumber;
}
return total;
}
}
