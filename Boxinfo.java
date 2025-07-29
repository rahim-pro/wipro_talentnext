import java.util.*;
class BoxInfo{
	int width;
	int height;
	int depth;
	BoxInfo(){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxInfo box=new BoxInfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the detais");
		int width=sc.nextInt();
		int height=sc.nextInt();
		int depth=sc.nextInt();
		int volume=width*height*depth;
		System.out.println("Volume of a box "+volume);
		

	}

}