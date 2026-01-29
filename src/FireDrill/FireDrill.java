package FireDrill;

import java.util.Arrays;
import java.util.Scanner;
public class FireDrill{
public static void main(String...args){
 Scanner input = new Scanner(System.in);
int [] str= {1,15,30,4,5,6,7,8,9,10};
//taskThree(str);
//taskOne(input);
System.out.print(Arrays.toString(taskTwelve(str)));
//System.out.print(taskEleven(str));
}

public static int[] taskOne(Scanner input){
int [] scores = new int[10];
    for(int count=0; count<10;count++){
        System.out.print("Enter score: ");
        int score = input.nextInt();
        scores[count]= score;
}
return scores;
}

public static void taskTwo(Scanner input){
int [] scores = new int[10];
    for(int count=0; count<10;count++){
        System.out.print("Enter score:");
        int score = input.nextInt();
        scores[count]= score;
}
    for(int count=0; count < scores.length;count++){
        System.out.println(scores[count]);
    }
}

public static void taskThree(Scanner input){
int [] scores = new int[10];
    for(int count=0; count<10;count++){
        System.out.print("Enter score " + (count+1) + ":");
        int score = input.nextInt();
        scores[count]= score;
}
 for(int count=0; count < scores.length;count++){
        System.out.print(scores[count]);
        System.out.print(" ");
    }
}
//public static void taskFour(Scanner input){
//int [] scores = new int[10];
//    for(int count=0; count<10;count++){
//        System.out.print("Enter score " + (count+1) + ":");
//        int score = input.nextInt();
//        scores[count]= score;
//}
// for(int count=0; count < scores.length;count+=2){
//        System.out.print(scores[count]);
//        System.out.print(" ");
//    }
//}
public static int[] taskFour(int[] array){
int length;
if((array.length)%2 != 0){
 length = (array.length/2)+1;
}
else{
length= array.length/2;
}
int[] even = new int[length];
int counter =0;
for(int count=0;count<=array.length-1;count+=2){
even[counter] = array[count];
counter++;
}
return even;
}

public static int[] taskFive(int[] array){
int length;
if((array.length)%2 != 0){
 length = (array.length/2)+1;
}
else{
length= array.length/2;
}
int[] odd = new int[length];
int counter =0;
for(int count=1;count<=array.length-1;count+=2){
odd[counter] = array[count];
counter++;
}
return odd;
}

public static int taskSix(int[] array){
int length;
    if((array.length)%2 != 0){
     length = (array.length/2)+1;
    }
    else{
    length= array.length/2;
    }
int[] even = new int[length];
int counter =0;
int sum=0;
    for(int count=0;count<=array.length-1;count+=2){
    even[counter] = array[count];
    counter++;
    sum+=array[count] ;
    }
return sum;
}

public static int taskSeven(int[] array){
int length;
    if((array.length)%2 != 0){
     length = (array.length/2)+1;
    }
    else{
    length= array.length/2;
    }
int[] even = new int[length];
int counter =0;
int sum=0;
    for(int count=1;count<=array.length-1;count+=2){
    even[counter] = array[count];
    counter++;
    sum+=array[count] ;
    }
return sum;
}

public static int taskEight(int[] array){
int length;
if((array.length)%2 != 0){
 length = (array.length/2)+1;
}
else{
length= array.length/2;
}
int[] even = new int[length];
int counter =0;
for(int count=0;count<=array.length-1;count+=2){
even[counter] = array[count];
counter++;
}
int smallest = even[0];
for(int small=0; small < even.length;small++){
if(even[small] < smallest){
    smallest = even[small];
}
}
return smallest;
}

public static int taskNine(int[] array){
int length;
if((array.length)%2 != 0){
 length = (array.length/2)+1;
}
else{
length= array.length/2;
}
int[] odd = new int[length];
int counter =0;
for(int count=1;count<=array.length-1;count+=2){
odd[counter] = array[count];
counter++;
}
int smallest = odd[0];
for(int small=0; small < odd.length;small++){
if(odd[small] < smallest){
    smallest = odd[small];
}
}
return smallest;
}

public static int taskTen(int[] array){
int length;
if((array.length)%2 != 0){
 length = (array.length/2)+1;
}
else{
length= array.length/2;
}
int[] even = new int[length];
int counter =0;
for(int count=0;count<=array.length-1;count+=2){
even[counter] = array[count];
counter++;
}
int largest = even[0];
for(int large=0; large < even.length;large++){
if(even[large] > largest){
    largest = even[large];
}
}
return largest;
}

public static int taskEleven(int[] array){
int length;
if((array.length)%2 != 0){
 length = (array.length/2)+1;
}
else{
length= array.length/2;
}
int[] odd = new int[length];
int counter =0;
for(int count=1;count<=array.length-1;count+=2){
odd[counter] = array[count];
counter++;
}
int largest = odd[0];
for(int large=0; large < odd.length;large++){
if(odd[large] > largest){
    largest = odd[large];
}
}
return largest;
}

public static int[] taskTwelve(int[] array){
int tempContainer=0;

    for(int count=1; count<array.length; count++){
        if(count % 2 != 0){
            tempContainer=array[count-1]; 
            array[count-1] = array[count];
            array[count] = tempContainer;
        }
    }
return array;
}

public static int[] taskThirteen(int[] array){
int tempContainer=0;

    for(int count=1; count<=array.length-1; count++){
        if(array[count] % 2 != 0){
            tempContainer=array[count-1]; 
            array[count-1] = array[count];
            array[count] = tempContainer;
        }
    }
return array;
}

public static int[] taskFourteen(int[] array){
int tempContainer=0;

    for(int count=0; count<array.length-1; count+=2){
        if(array[count] % 2 == 0){
            tempContainer=array[count+1]; 
            array[count] = array[count+1];
            array[count+1] = tempContainer;
        }
    }
return array;
}
}
