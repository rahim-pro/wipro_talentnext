import java.util.Arrays;

public class Array12 {
    public static void main(String[] args) {
        // Test cases
        int[] a1 = {1, 2, 3};
        int[] b1 = {4, 5, 6};

        int[] a2 = {7, 7, 7};
        int[] b2 = {3, 8, 0};

        int[] a3 = {5, 2, 9};
        int[] b3 = {1, 4, 5};

        System.out.println("middleWay([1, 2, 3], [4, 5, 6]) → " + Arrays.toString(middleWay(a1, b1)));
        System.out.println("middleWay([7, 7, 7], [3, 8, 0]) → " + Arrays.toString(middleWay(a2, b2)));
        System.out.println("middleWay([5, 2, 9], [1, 4, 5]) → " + Arrays.toString(middleWay(a3, b3)));
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};  // Middle element is at index 1
    }
}