package Opes;

import java.util.Arrays;
public class ArraysTask{
public static void main(String...args){
int []array = {6,7,9,1};
int [] square = sortArray(array);
int [] srt = squareArray(square);
System.out.println(Arrays.toString(srt));
//for(int count = 0; count< array.length;count++){
//System.out.println(srt[count]);
//}
}
public static int[] sortArray(int[] sortedArray){
//int tempContainer= 0;

//sortArray = new [sortedArray.length];
    for(int count = 0; count < sortedArray.length; count++ ){
        for(int counter = 0; counter < sortedArray.length; counter++){
            if(sortedArray[counter] > sortedArray[count]){
                sortedArray[count] = sortedArray[count]+sortedArray[counter] ;
                sortedArray[counter] = sortedArray[count]-sortedArray[counter];
                sortedArray[count] = sortedArray[count]-sortedArray[counter];
                }
            }
    }
return sortedArray;
}
public static int[] squareArray(int[] sortNewArray){
int [] sort = sortArray(sortNewArray);
for(int count= 0; count < sortNewArray.length;count++ ){
sort[count]= sort[count]*sort[count];
}
return sort;
}

}
