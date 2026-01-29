public class Test{
public static void main (String [] args){
int [] numbers = {1,6,9,8,87,4};
int[]num=(swap(numbers));
for(int count= 0;count< num.length;count++){
System.out.println(num[count]);
}
}

public static boolean[] isPerfect (int[]num){
boolean [] number = new boolean [num.length];
for(int index = 0; index < num.length;index++){
    for(int counter = 1; counter <= num[index]/2;counter ++){
    if(counter * counter == num[index]){
    number[index]=true;
break;
    }
    else{
    number[index]=false;
}
    }

}
return number;
}

public static int[] swap (int[] num){
//int [] swapped = new int [num.length];
int tempContainer = 0;
for(int index = 0; index < num.length;index++){
for(int counter= 0; counter < num.length; counter++){
if(num[index] > num[counter]){
tempContainer = num[counter];
num[counter] = num[index];
num[index] = tempContainer;
}
}
}
return num;
}

}
