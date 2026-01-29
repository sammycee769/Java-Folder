package EOB;

import java.util.Arrays;
public class Functions{
public static int isLargest (int number[]){
int largest = number[0];
for(int count = 0;count < number.length;count++){
if(number[count] > largest)
largest = number[count];
}
return largest;
}
public static String reverse(int[] number){
int[] reversed = new int[number.length];
int counter =0;
for (int count=number.length-1;count>=0;count--){
reversed[counter] = number[count];
counter++;
}
return Arrays.toString(reversed);
}
public static int payment(int deliveries){
int payment;
if(deliveries >= 70){
 payment =(500*deliveries)+5000;
}
else if(deliveries >=60 & deliveries <=69 ){
 payment =(250*deliveries)+5000;
}
else if(deliveries >=50 & deliveries <=59 ){
 payment =(200*deliveries)+5000;
}
else{
 payment =(160*deliveries)+5000;
}
return payment;
}
public static boolean contains(int[] number,int element){
boolean result = false;
for(int count:number){
if(count == element)
result = true;
}
return result;
}
public static String oddPosition(int[]number){
int length = 0;
if(number.length%2 !=0){
length = (number.length + 1)/2;
}
else{
length = number.length/2;
}
int[] odd = new int[length];
int counter =0;
for(int count=0;count<=number.length-1;count+=2){
odd[counter] = number[count];
counter++;
}
return Arrays.toString(odd);
}
public static String evenPosition(int[]number){
int[] even = new int[number.length/2];
int counter =0;
for(int count=1;count<=number.length-1;count+=2){
even[counter] = number[count];
counter++;
}
return Arrays.toString(even);
}
public static int total(int[]number){
int total = 0;
for(int count:number){
total+=count;
}
return total;
}
public static String combineArray(int[] firstArray, int[] secondArray){
int [] newArray = new int [firstArray.length + secondArray.length];
int firstArrayCount = 0;
int secondArrayCount = 0;
int newArrayCount = 0;
while (firstArrayCount < firstArray.length && secondArrayCount < secondArray.length) {
newArray[newArrayCount++] = firstArray[firstArrayCount++];
newArray[newArrayCount++] = secondArray[secondArrayCount++];
}
while (firstArrayCount < firstArray.length) {
newArray[newArrayCount++] = firstArray[firstArrayCount++];
}
while (secondArrayCount < secondArray.length) {
newArray[newArrayCount++] = secondArray[secondArrayCount++];
}
return  Arrays.toString(newArray);
}
public static int contained(int[] number,int element){
int result = -1;
for(int count=0;count<=number.length;count++){
if(count == element)
result = count-1;
}
return result;
}
public static boolean isPalindrome(String word) {

char[] letters = word.toCharArray();

for (int count = 0; count < letters.length / 2; count++) {
if (letters[count] == letters[letters.length - 1 - count]) {
return true; 
}
}
return false;
}
public static String concatenateArray(int[] firstArray, int[] secondArray){
int [] newArray = new int [firstArray.length + secondArray.length];
int counter = 0;
for(int count = 0;count < firstArray.length;count++){
newArray[counter++] = firstArray[count];
}
for(int count= 0; count<secondArray.length;count++){
newArray[counter++] = secondArray[count];
}

return Arrays.toString(newArray);
}









}
