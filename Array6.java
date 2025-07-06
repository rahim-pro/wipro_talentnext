import java.util.Arrays;

public class Array6{
    public static void main(String[] args) {
        // Initialize array
        int[] arr = {5, 2, 8, 1, 3};

        // Sort the array
        Arrays.sort(arr);

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}