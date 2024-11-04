package akash;

import java.util.TreeMap;

public class TreeMapRemoveEntry {
    public static void main(String[] args) {
        // Initialize TreeMap with some key-value pairs
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);

        System.out.println("Initial TreeMap: " + treeMap);

        // Remove and return entry associated with a specific key
        String keyToRemove = "Two";
        Integer removedValue = treeMap.remove(keyToRemove); // Remove entry with key "Two"
        System.out.println("Removed value for key '" + keyToRemove + "' = " + removedValue);

        // Check if another entry is present (e.g., "Three")
        boolean isThreePresent = treeMap.containsKey("Three");
        System.out.println("Is the entry with key 'Three' present? " + isThreePresent);

        // Updated TreeMap after removal
        System.out.println("Updated TreeMap: " + treeMap);
    }
}
