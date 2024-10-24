package akash;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        // Declare an array with 5 elements
        int[] arr = {1, 2, 3, 4, 5};

        // Access elements beyond the array size
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}

