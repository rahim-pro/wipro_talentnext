import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] a=new String[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLine();
		}
		if(a.length==0) {
			System.out.println("no values");
		}
		else {
			for(int i=0;i<n;i++) {
				System.out.print(a[i]);
				if(i!=n-1) {
					System.out.print(",");
				}
			}
		}
	}

}