import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res="";
		int i=0;
		while(s.charAt(i)!='*') {
			i++;
		}
			res+=s.substring(0,i-1);
			res+=s.substring(i+2,s.length());
			System.out.println(res);
			
		
	}

}