package activities;

import java.util.Arrays;


public class Activity2 {
    public static void main(String[] args) {
        //Initialize the array
        int[] numbs = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numbs));
        int numFind = 10;
        int fixedSum = 30;
        //Print result
        System.out.println("Result: " + result(numbs, numFind, fixedSum));
    }

    public static boolean result(int[] numbers, int numFind, int fixedSum) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == numFind) {
                //Add them
                temp_sum += numFind;
            }

            //Sum should not be more than 30
            if (temp_sum > fixedSum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == fixedSum;
    }
}