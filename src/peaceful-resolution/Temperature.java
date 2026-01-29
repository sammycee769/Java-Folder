package peaceful;

import java.util.Scanner;
public class Temperature{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter temperature");
double temperature = input.nextDouble();
if (temperature < 15){
System.out.println("cold");
}else if(temperature >= 15 && temperature <= 30){
System.out.println("warm");
}else{
System.out.println("hot");
}

}
}
