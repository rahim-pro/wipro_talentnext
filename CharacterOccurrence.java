import java.io.*;
import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

  
        System.out.print("Enter the character to be counted: ");
        char target = sc.next().toLowerCase().charAt(0);

        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int ch;

            while ((ch = reader.read()) != -1) {
                if (Character.toLowerCase((char) ch) == target) {
                    count++;
                }
            }

            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + target + "'.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }

        
    }
}