import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String res="";
		if(a.length()<b.length()) {
			res=res+a+b+a;
		}
		else {
			res+=b+a+b;
		}
		System.out.println(res);
	}

}