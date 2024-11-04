package akash;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapIteration {
    public static void main(String[] args) {
        // Initialize TreeMap with some key-value pairs
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);

        System.out.println("TreeMap for iteration: " + treeMap);

        // 1. Using entrySet() with for-each loop
        System.out.println("\nUsing entrySet() with for-each loop:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 2. Using keySet() with for-each loop
        System.out.println("\nUsing keySet() with for-each loop:");
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        // 3. Using values() with for-each loop
        System.out.println("\nUsing values() with for-each loop:");
        for (Integer value : treeMap.values()) {
            System.out.println("Value: " + value);
        }

        // 4. Using Iterator with entrySet()
        System.out.println("\nUsing Iterator with entrySet():");
        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 5. Using forEach() method (Java 8 and later)
        System.out.println("\nUsing forEach() method:");
        treeMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
