import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 3, 5, 22, 1, 15, 7, 8};

        // Check if array has at least 2 elements
        if (arr.length < 2) {
            System.out.println("Array must contain at least 2 elements.");
            return;
        }

        // Sort the array
        Arrays.sort(arr);

        // Smallest two numbers
        int smallest1 = arr[0];
        int smallest2 = arr[1];

        // Largest two numbers
        int largest1 = arr[arr.length - 1];
        int largest2 = arr[arr.length - 2];

        // Print results
        System.out.println("Smallest two numbers: " + smallest1 + ", " + smallest2);
        System.out.println("Largest two numbers: " + largest2 + ", " + largest1);
    }
}