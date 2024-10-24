package akash;

import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(14);
        numbers.add(3);
        numbers.add(10);

        int sum = 0;

        // Calculate the sum of even numbers
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of Even Numbers: " + sum);
    }
}

