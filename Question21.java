import java.util.*;
public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		if(rev==temp) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
	}

}