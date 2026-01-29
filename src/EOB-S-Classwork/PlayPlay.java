package EOB;

import java.util.Arrays;
public class PlayPlay {
    public static void main(String... args) {

        int[] numbers = {2, 5, 3, 8, 7, -3};
//        System.out.println(Arrays.toString(sumOfHighandLOws(numbers)));


    }

    public static int[] squareofEven(int[] number) {
        int[] newArray = new int[number.length];
        int counter = 0;
        for (int count : number) {
            if (count % 2 == 0)
                newArray[counter] = count * count;
            else if (count % 2 != 0)
                newArray[counter] = count + 1;
            if (count < 1)
                newArray[counter] = count + 1;
            counter++;
        }
        return newArray;
    }

//    public static int[] highestAndLowest(int[] numbers) {
//        int[] newArr = new int[2];
//        int largest = numbers[0];
//        int count = 0;
//        int smallest = numbers[0];
//        for (int elements : numbers) {
//            if (largest < elements) largest = elements;
//            if (smallest > elements) smallest = elements;
//            count++;
//        newArr[0] = largest[elements];
//        newArr[1] = smallest[elements];
//        }
//        return newArr;
//    }

    public static int[] highestAndLowestindex(int[] numbers) {
        int[] newArr = new int[2];

        int largestIndex = 0;
        int smallestIndex = 0;

        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] > numbers[largestIndex]) {
                largestIndex = index;
            }
            if (numbers[index] < numbers[smallestIndex]) {
                smallestIndex = index;
            }
        }

        newArr[0] = largestIndex;
        newArr[1] = smallestIndex;

        return newArr;
    }

//    public static int sumOfHighandLOws(int[] numbers) {
//        int sum = 0;
//        for (int elements : highestAndLowest(numbers))
//            sum += elements;
//
//        return sum;
//    }

    public static int[] sumOfElement(int target, int[] numbers) {
        int[] sum = new int[2];
        for (int counter = 0; counter < numbers.length; counter++) {
            for (int index = 0; index < numbers.length; index++) {
                if (target == numbers[counter] + numbers[index]) {
                    sum[0] = counter;
                    sum[1] = index;
                    break;
                }


            }
        }
        return sum;
    }
}