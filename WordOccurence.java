import java.io.*;
import java.util.*;

public class WordOccurence {
    public static void main(String[] args) throws IOException {
  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input file name: ");
        String inputFile = sc.nextLine();
        System.out.print("Enter the output file name: ");
        String outputFile = sc.nextLine();

       
        TreeMap<String, Integer> wordCount = new TreeMap<>();

   
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+"); 
            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        reader.close();

      
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            writer.write(entry.getKey() + " : " + entry.getValue());
            writer.newLine();
        }
        writer.close();

        System.out.println("Word counts written to: " + outputFile);
    }
}