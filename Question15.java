import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		int n=s.length();
		int n1=s1.length();
		int i=0;
		int j=0;
		String res="";
		while(i<n && j<n1) {
			res+=s.charAt(i);
			res+=s1.charAt(j);
			i++;
			j++;
		}
		while(i<n) {
			res+=s.charAt(i);
			i++;
		}
		while(j<n1) {
			res+=s1.charAt(j);
			j++;
		}
		System.out.println(res);
	}

}