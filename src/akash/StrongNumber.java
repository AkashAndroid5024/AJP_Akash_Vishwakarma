package akash;

import java.util.Scanner;

public class StrongNumber {
    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i; // Multiply each number up to 'n'
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number to check if it's a strong number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num; // Store the original number
        int sum = 0;

        // Calculate the sum of factorial of each digit
        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            sum += factorial(digit); // Add its factorial to the sum
            num /= 10; // Remove the last digit
        }

        // Check if the sum of factorials equals the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong Number.");
        } else {
            System.out.println(originalNum + " is not a Strong Number.");
        }

        scanner.close(); // Close the scanner
    }
}

