import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrintAll {

  
    public static void printAll(ArrayList<String> list) {
        Iterator<String> itr = list.iterator();
        System.out.println("\nElements in the ArrayList:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();

        System.out.print("How many strings do you want to enter? ");
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter string " + i + ": ");
            String input = sc.nextLine();
            stringList.add(input);
        }

       
        printAll(stringList);

        
    }
}