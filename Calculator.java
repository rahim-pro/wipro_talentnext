import java.util.*;

public class Calculator {
	public static int powerInt(int num1,int num2) {
		return (int) Math.pow(num1, num2);
	}
	public static double powerDouble(double num1,double num2) {
		return Math.pow(num1,num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int intnum1=sc.nextInt();
		int intnum2=sc.nextInt();
		
		System.out.println(cal.powerInt(intnum1,intnum2));
		double doublenum1=sc.nextDouble();
		int doublenum2=sc.nextInt();
		System.out.println(cal.powerDouble(doublenum1,doublenum2));
		
		

	}

}