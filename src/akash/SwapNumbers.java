package akash;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without a third variable using XOR
        a = a ^ b; // a becomes 15 (in binary: 1010 ^ 0101)
        b = a ^ b; // b becomes 5 (in binary: 1010 ^ 1010 = 0101)
        a = a ^ b; // a becomes 10 (in binary: 0101 ^ 1010 = 1010)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

