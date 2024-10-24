package akash;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringList {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        System.out.println("Original List: " + stringList);

        // Reverse the list
        Collections.reverse(stringList);

        System.out.println("Reversed List: " + stringList);
    }
}

