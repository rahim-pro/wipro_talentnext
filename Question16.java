import java.util.*;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(prime(n));
	}
	public static boolean prime(int n) {
		if(n<1) {
			return false;
		}
		else {
			for(int i=2;i<Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
}
}