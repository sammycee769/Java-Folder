package Opes;

import java.util.Arrays;
public class GreaterNumber{
public static void main(String...args){
int [][]array = {{-6,-7},{-9,-1},{-3,-2}};

System.out.println(sum(array));
}

public static int  sum(int [][] array){
int sum=0;
int largest = 0;
    for(int index=0; index<array[0].length;index++){
       largest+=array[0][index];
    }
    for(int count = 0; count<array.length;count++ ){
        for(int counter= 0; counter < array[count].length;counter++){
            sum+=array[count][counter];
        }
         if(largest < sum){
            largest = sum;
            }
            sum=0;
    }
return largest;
}
}
