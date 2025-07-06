public class Array7 {
    public static void main(String[] args) {
        // Input array
        int[] arr = {12, 34, 12, 45, 67, 89};

        // Create a new array to store unique elements
        int n = arr.length;
        int[] temp = new int[n];
        int newLength = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] is already in temp
            for (int j = 0; j < newLength; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to temp
            if (!isDuplicate) {
                temp[newLength] = arr[i];
                newLength++;
            }
        }

        // Print the result
        System.out.print("Output: (");
        for (int i = 0; i < newLength; i++) {
            System.out.print(temp[i]);
            if (i < newLength - 1) {
                System.out.print(",");
            }
        }
        System.out.println(")");
    }
}