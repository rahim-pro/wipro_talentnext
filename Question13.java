import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		String res="";
		if(s.charAt(0)=='x' && s.charAt(n-1)=='x') {
			res=s.substring(1,n-1);
		}
		else {
			res=s;
		}
		System.out.println(res);
	}

}