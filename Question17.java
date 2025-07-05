import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i<99;i++) {
			if(prime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static boolean prime(int n) {
		if(n<=1) {
			return false;
		}
		else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}

}