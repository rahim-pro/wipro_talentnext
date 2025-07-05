import java.util.*;
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		while(n!=0) {
			int d=n%10;
			s+=d;
			n/=10;
		}
		System.out.println(s);
	}

}