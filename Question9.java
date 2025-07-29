import java.util.*;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int j=s.length()-1;
		boolean found=true;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(j)) {
				found=false;
				break;
			}
			j--;
		}
		if(found) {
			System.out.println("Given is a palindrome");
		}
		else {
			System.out.println("Give is not a palindrome");
		}
	}

}