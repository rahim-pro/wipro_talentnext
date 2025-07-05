import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.nextLine().charAt(0);
		if(Character.isDigit(c)) {
			System.out.println("digit");
		}
		else if(Character.isLetter(c)) {
			System.out.println("letter");
		}
		else {
			System.out.println("special symbol");
		}
	}

}
