import java.util.Scanner;

public class Junit1 {
    public static void main(String[] args) {
        DailyTask tasks = new DailyTask();
        Scanner sc = new Scanner(System.in);

        // 1. String Concatenation
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        System.out.println("Concatenated String: " + tasks.doStringConcat(s1, s2));

        // 2. Sort Values
        System.out.print("\nEnter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sorted = tasks.sortValues(arr);
        System.out.print("Sorted Array: ");
        for(int val : sorted) {
            System.out.print(val + " ");
        }

        // 3. Check String Presence
        sc.nextLine(); // consume leftover newline
        System.out.print("\n\nEnter main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter substring to check: ");
        String subStr = sc.nextLine();
        boolean result = tasks.checkPresence(mainStr, subStr);
        System.out.println("Is substring present? " + result);

        sc.close();
    }
}