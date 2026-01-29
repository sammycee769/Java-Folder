package PhaseGateOne.Java.DayTwo;

import java.util.Scanner;
import java.util.ArrayList;
public class GroceryApp{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
ArrayList <String> item = new ArrayList<>();

    String menu =  """
        1. Add item
        2. Remove Item
        3. Show All Available Items.
        0. Exit

""";
System.out.print(menu);
menu:while(true){

System.out.println("Enter an option: ");
int menu_option = input.nextInt();
switch (menu_option){
   
    case 1-> {
//        System.out.print("How many items do you wish to add: ");
//        int option = input.nextInt();
        menus:while(true){
        System.out.println("What items do you wish to add: ");
        String options = input.nextLine();
        item.add(options);
        System.out.print(menu);
        break menus;
        
}
}
    case 2->{
        System.out.print("What items do you wish to remove: ");
        String optionTwo = input.nextLine();}
    case 3->{}
    case 0-> {break menu;}
    default->System.out.println("Enter a valid option");
}
}
}
}

