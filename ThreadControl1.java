import java.util.Scanner;

class NumberTask extends Thread {
	int start, end, delayAfter;

	
	public NumberTask(int start, int end, int delayAfter) {
		this.start = start;
		this.end = end;
		this.delayAfter = delayAfter;
	}

	@Override
	public void run() {
		try {
			for (int i = start; i <= end; i++) {
				System.out.println(i);

				if (i == delayAfter) {
					System.out.println("Pausing for 5 seconds after " + i + "...");
					Thread.sleep(5000);
				} else {
					Thread.sleep(500);
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted.");
		}
	}
}

public class ThreadControl1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter start number: ");
		int start = scanner.nextInt();

		System.out.print("Enter end number: ");
		int end = scanner.nextInt();

		System.out.print("Enter number after which to delay (e.g., 5): ");
		int delayAfter = scanner.nextInt();

		NumberTask task = new NumberTask(start, end, delayAfter);
		task.start();

		scanner.close();
	}
}