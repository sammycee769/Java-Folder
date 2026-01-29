package EOB;

import java.util.Arrays;
public class StandardDeviation{
public static int total(int[]number){
int total = 0;
for(int count:number){
total+=count;
}
return total;
}
public static int length(int[]number){
int count = 0;
for(int counter:number){
count++;
}
return count;
}
public static double mean(int[] number){
double average = (double)(total(number))/(double)length(number);
return average;
}
public static String deviation(int[] number){
int length=length(number);
double[] variance = new double[length];
int counter= 0;
double mean = mean(number);
for(int count=1; count<length-1; count++){
variance[counter]=number[(int) (count-mean)];
counter++;
}
return Arrays.toString(variance);
}
}
