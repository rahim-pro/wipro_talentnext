import java.util.Scanner;

class EvenThread extends Thread {
	int start, end;

	public EvenThread(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public void run() {
		System.out.println("Even Numbers:");
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					System.out.println("Even thread interrupted.");
				}
			}
		}
		System.out.println();
	}
}

class OddThread extends Thread {
	int start, end;

	public OddThread(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public void run() {
		System.out.println("Odd Numbers:");
		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					System.out.println("Odd thread interrupted.");
				}
			}
		}
		System.out.println();
	}
}

public class ThreadControl2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter start number: ");
		int start = scanner.nextInt();

		System.out.print("Enter end number: ");
		int end = scanner.nextInt();

		EvenThread even = new EvenThread(start, end);
		OddThread odd = new OddThread(start, end);

		even.start();

		try {
			even.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}

		odd.start();

		scanner.close();
	}
}