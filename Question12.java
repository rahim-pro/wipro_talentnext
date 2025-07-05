import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.nextLine().charAt(0);
		switch(c) {
		case 'R':
			System.out.println("R --> Red");
			break;
		case 'O':
			System.out.println("O --> Orange");
			break;
		case 'B':
			System.out.println("B --> Blue");
			break;
		case 'G':
			System.out.println("G --> Green");
			break;
		case 'W':
			System.out.println("W --> White");
			break;
		case 'Y':
			System.out.println("Y --> Yellow");
			break;
		default:
			System.out.println("Invalid color");
		}
		
	}

}