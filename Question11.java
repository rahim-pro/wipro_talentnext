import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.nextLine().charAt(0);
		if(Character.isLowerCase(c)) {
			System.out.println(Character.toUpperCase(c));
		}
		else {
			System.out.println(Character.toLowerCase(c));
		}
	}

}