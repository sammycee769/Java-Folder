package EOB;

import java.util.Scanner;

public class RightAngledtriangle {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter any number  ");
int number = input.nextInt();
for (int count = 1; count <= number ; count++){
    for(int innerCount = count; innerCount>=1;innerCount--){
        System.out.print("* ");

}
System.out.println("");
}
}
} 
