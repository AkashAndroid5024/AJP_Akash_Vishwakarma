package akash;

import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> numbers = new HashSet<>();

        // Adding initial elements to the HashSet
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Displaying the HashSet before adding an element
        System.out.println("HashSet before adding: " + numbers);

        // Append the specified element to the HashSet
        numbers.add(4); // Adding element to the end (order is not guaranteed)

        // Displaying the HashSet after adding the element
        System.out.println("HashSet after adding: " + numbers);
    }
}

