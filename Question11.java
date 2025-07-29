import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String n="";
		if(s.length()%2!=0) {
			System.out.println("null");
		}
		else {
			n=n+s.substring(0,s.length()/2);
		}
		System.out.println(n);
	}

}