package foundation;

import java.util.Scanner;
public class Eggs{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("How many eggs do you have");
int eggs = input.nextInt();
int eggsDozen = eggs / 12;
int eggsRemaining = eggsDozen % 10;
if(eggs > 500){
int eggsGross = eggs / 144;
int reminant = eggsGross * 144;
int reminantTwo = eggs - reminant;
int dozen = reminantTwo / 12;
int eggsLeft = reminantTwo - (dozen * 12);
System.out.printf("Your number of eggs is %d gross, %d dozen, and %d left over", eggsGross,dozen,eggsLeft);
}else{
System.out.printf("Your number of eggs is %d dozen, and %d left over", eggsDozen,eggsRemaining);
}
}
}
