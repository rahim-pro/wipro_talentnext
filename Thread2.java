import java.util.Random;
import java.util.Scanner;

class ColorTask implements Runnable {
    String[] colours;

 
    public ColorTask(String[] colours) {
        this.colours = colours;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            int index = random.nextInt(colours.length);
            String selectedColor = colours[index];

            System.out.println("Selected Color: " + selectedColor);

            if (selectedColor.equalsIgnoreCase("red")) {
                System.out.println("Red color found! Stopping display.");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                break;
            }
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter number of colors: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

     
        String[] userColours = new String[n];
        System.out.println("Enter " + n + " color names:");
        for (int i = 0; i < n; i++) {
            userColours[i] = scanner.nextLine();
        }

       
        ColorTask task = new ColorTask(userColours);
        Thread thread = new Thread(task);
        thread.start();

        scanner.close();
    }
}