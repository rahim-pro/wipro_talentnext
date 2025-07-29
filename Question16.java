import java.util.*;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		int len=s.length();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(s.substring(len-3,len));
		}
		System.out.println(sb.toString());
		
	}

}