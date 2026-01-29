package Opes;

import java.util.Arrays;
public class MinimumMaximum{
public static void main(String...args){
int [][]array = {{6,7},{9,1},{3,2}};
int [][] sort = maximumMinimumIndex(array);
System.out.println(Arrays.deepToString(sort));
}

public static int[][] maximumMinimumIndex(int [][] newArray){
int maximum = newArray[0][0];
int minimum = newArray[0][0];
int [][] result = new int [2][2];
    for(int count = 0; count < newArray.length; count++){
        for(int counter= 0; counter < newArray[count].length; counter ++){
            if(newArray[count][counter] > maximum){
                maximum = newArray[count][counter];
                result[0][0] = count;
                result[0][1] = counter;
                }

            if(newArray[count][counter] < minimum){
                minimum = newArray[count][counter];
                result[1][0] = count;
                result[1][1] = counter;
            }
        }
    }
return result;
}
}
