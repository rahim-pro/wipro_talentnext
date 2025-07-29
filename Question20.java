import java.util.*;
public class Question20 {
	String na="hello";
	String default_name="india";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question20 q=new Question20();
		Optional<String> n=Optional.ofNullable(q.na);
		System.out.print(n.orElse(q.default_name));
	}

}