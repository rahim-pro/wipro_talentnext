import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s.substring(0,2);
		int n=s.length();
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<n) {
			sb.append(s1);
			i++;
		}
		System.out.println(sb.toString());
	}

}