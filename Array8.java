public class Array8 {
    public static void main(String[] args) {
        // Example input arrays (You can test with different ones)
        int[] arr = {10, 3, 6, 1, 2, 7, 9};  // Expected output: 22

        int sum = 0;
        boolean skip = false;

        for (int num : arr) {
            if (num == 6) {
                skip = true;  // Start ignoring
            }

            if (!skip) {
                sum += num;
            }

            if (num == 7 && skip) {
                skip = false; // Stop ignoring
            }
        }

        // Output the result
        System.out.println("Sum: " + sum);
    }
}