package akash;

import java.util.Stack;

public class StackElements {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Adding 10 elements to the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i); // Push elements to the stack
        }

        // Display the stack after adding 10 elements
        System.out.println("Stack after adding 10 elements: " + stack);

        // Removing 4 elements from the stack
        for (int i = 1; i <= 4; i++) {
            stack.pop(); // Remove the top element
        }

        // Display the stack after removing 4 elements
        System.out.println("Stack after removing 4 elements: " + stack);
    }
}
