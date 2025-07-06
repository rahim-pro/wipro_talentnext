public class Array4 {
    public static void main(String[] args) {
        // Initialize array with ASCII values
        int[] asciiValues = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};

        // Print corresponding characters in a single row
        for (int value : asciiValues) {
            System.out.print((char) value);
        }
    }
}