package EOB;

import java.util.Arrays;
public class SwapTask{
public static void main(String[]args){
//int numberOne = 2;
//int numberTwo = 3;
//int numberThree = numberOne;
//numberOne = numberTwo;
//numberTwo = numberThree;
//
//
//System.out.printf("%d,%d",numberOne,numberTwo);
//

int [] array = {2,9,3,4,5,1,7} ;
int tempContainer=0;

for(int count = 0;count<array.length;count++){
for(int index=0;index<array.length;index++){
if (array[count]>array[index]){
tempContainer=array[index];
array[index]=array[count];
array[count]=tempContainer;
}
}
}
System.out.println(Arrays.toString(array));



for(int index = 0;index<array.length;index++){
for(int count=0;count<array.length;count++){
if (array[index]<array[count]){
tempContainer=array[count];
array[count]=array[index];
array[index]=tempContainer;
}
}
}
System.out.println(Arrays.toString(array));
}
}
