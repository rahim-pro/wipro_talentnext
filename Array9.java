import java.util.Arrays;

public class Array9 {
    public static void main(String[] args) {
        // Test arrays
        int[] arr1 = {1, 10, 10, 2};
        int[] arr2 = {10, 2, 10};
        int[] arr3 = {1, 99, 10};

        System.out.println("withoutTen(" + Arrays.toString(arr1) + ") => " + Arrays.toString(withoutTen(arr1)));
        System.out.println("withoutTen(" + Arrays.toString(arr2) + ") => " + Arrays.toString(withoutTen(arr2)));
        System.out.println("withoutTen(" + Arrays.toString(arr3) + ") => " + Arrays.toString(withoutTen(arr3)));
    }

    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        // Copy non-10 values to result
        for (int num : nums) {
            if (num != 10) {
                result[index++] = num;
            }
        }

        // Remaining elements are already 0 by default in Java arrays
        return result;
    }
}