package akash;

import java.util.HashMap;

public class AssociateValueWithKey {
    public static void main(String[] args) {
        // Creating a HashMap to store Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // Displaying the HashMap
        System.out.println("HashMap: " + map);
    }
}

