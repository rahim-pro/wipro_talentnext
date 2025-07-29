import java.util.Scanner;

class UserPriorityThread extends Thread {
    public UserPriorityThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread " + getName() + " started with priority: " + getPriority());

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }

        System.out.println("Thread " + getName() + " finished.");
    }
}

public class ControlThread3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        UserPriorityThread[] threads = new UserPriorityThread[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name for Thread " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter priority for " + name + " (1 to 10): ");
            int priority = scanner.nextInt();
            scanner.nextLine(); 

            threads[i] = new UserPriorityThread(name);

           
            if (priority < Thread.MIN_PRIORITY || priority > Thread.MAX_PRIORITY) {
                System.out.println("Invalid priority. Setting to NORM_PRIORITY (5).");
                threads[i].setPriority(Thread.NORM_PRIORITY);
            } else {
                threads[i].setPriority(priority);
            }
        }

     
        for (UserPriorityThread thread : threads) {
            thread.start();
        }

        scanner.close();
    }
}