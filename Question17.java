import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			li.add(sc.nextLine());
		}
		StringJoiner sj=new StringJoiner(",","{","}");
		for(String a:li) {
			sj.add(a);
		}
		System.out.println(sj.toString());
	}

}