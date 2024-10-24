package akash;

import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        // Input the bit position to check (0-based index)
        System.out.print("Enter the bit position (n): ");
        int n = scanner.nextInt();

        // Shift the bit 'n' places to the right and use bitwise AND with 1
        String result = ((num & (1 << n)) != 0)
                ? "The " + n + "th bit is set (1)."
                : "The " + n + "th bit is not set (0).";

        // Display the result
        System.out.println(result);

        scanner.close(); // Close the scanner
    }
}
