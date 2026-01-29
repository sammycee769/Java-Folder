package peaceful;

import java.util.Scanner;
public class UserLogin{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("enter username");
String userName = input.nextLine();
System.out.println("enter 6 digit pin");
int pin = input.nextInt();
String userNameOne = "christian";
int pinOne = 123456;
if(userName.equals(userName) && pin == pinOne){
System.out.println("Login successful");
}else{
System.out.print("login failed");
}
}
}
