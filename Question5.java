import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(num(a,b));
	}
	public static boolean num(int a,int b) {
		return (a%10==b%10);
	}

}
