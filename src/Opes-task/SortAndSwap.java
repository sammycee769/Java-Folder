package Opes;

import java.util.Arrays;
public class SortAndSwap{
public static void main(String...args){
int [][]array = {{6,7},{9,1},{1,0},{1,-1}};
int []srt = sumOfArray(array);
int [] sorted = sortInAscending(srt);
System.out.println(Arrays.toString(sorted));
}
public static int[] sumOfArray(int[][] newArray){
int [] rowTotal = new int [newArray.length];

    for(int count=0; count < newArray.length; count++){
        int sum = 0;
        for(int counter=0; counter < newArray[count].length ;counter++){
            sum+= newArray[count][counter];
            }
        rowTotal[count] = sum;
        }
return rowTotal;
}

public static int[] sortInAscending(int[] array) {
    for (int count = 0; count < array.length - 1; count++) {
        for (int counter = 0; counter < array.length - 1; counter++) {
            if (array[counter] > array[counter + 1]) {
                int temp = array[counter];
                array[counter] = array[counter + 1];
                array[counter + 1] = temp;
            }
        }
    }
    return array;
}

}
