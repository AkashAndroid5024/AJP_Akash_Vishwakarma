package akash;

import java.util.Arrays;

public class SubArraySecondHighest {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] arr = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};

        // Get the subarray from index 2 to 6 (inclusive)
        int[] subArray = Arrays.copyOfRange(arr, 2, 7);
        System.out.println("Subarray: " + Arrays.toString(subArray));

        // Sort the subarray to find the second highest element
        Arrays.sort(subArray);

        // Second highest element will be at length - 2 index
        int secondHighest = subArray[subArray.length - 2];

        // Print the result
        System.out.println("2nd Highest element: " + secondHighest);
    }
}

