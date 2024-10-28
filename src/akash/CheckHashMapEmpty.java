package akash;

import java.util.HashMap;

public class CheckHashMapEmpty {
    public static void main(String[] args) {
        // Creating an empty HashMap
        HashMap<String, String> map = new HashMap<>();

        // Checking if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }

        // Adding an element to the HashMap
        map.put("Name", "Akash");

        // Checking again after adding an element
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }
    }
}

