import java.util.ArrayList;
import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Number> numberList = new ArrayList<>();

        System.out.print("How many numbers do you want to enter? ");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            String input = sc.next();

            try {
                if (input.contains(".")) {
                
                    double doubleVal = Double.parseDouble(input);
                    numberList.add(doubleVal);
                } else {
                
                    int intVal = Integer.parseInt(input);
                    numberList.add(intVal);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Skipping input: " + input);
            }
        }

       
        System.out.println("\nNumbers entered:");
        for (Number num : numberList) {
            System.out.println(num);
        }

        
    }
}