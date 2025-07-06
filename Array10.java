import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        // Test arrays
        int[] arr1 = {1, 0, 1, 0, 0, 1, 1};
        int[] arr2 = {3, 3, 2};
        int[] arr3 = {2, 2, 2};

        System.out.println("evenOdd(" + Arrays.toString(arr1) + ") => " + Arrays.toString(evenOdd(arr1)));
        System.out.println("evenOdd(" + Arrays.toString(arr2) + ") => " + Arrays.toString(evenOdd(arr2)));
        System.out.println("evenOdd(" + Arrays.toString(arr3) + ") => " + Arrays.toString(evenOdd(arr3)));
    }

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[start++] = num;  // place even numbers from start
            } else {
                result[end--] = num;    // place odd numbers from end
            }
        }

        return result;
    }
}