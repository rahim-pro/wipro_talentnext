import java.util.*;
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		StringJoiner sj=new StringJoiner("-");
		StringJoiner s2=new StringJoiner("-");
		for(int i=0;i<n;i++) {
			sj.add(sc.nextLine());
			
		}
		for(int i=0;i<n;i++) {
			s2.add(sc.nextLine());
		}
		sj.merge(s2);
		s2.merge(sj);
		System.out.println(sj.toString());
		System.out.println(s2.toString());
	}

}