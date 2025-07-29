public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird a=new Bird();
		a.eat();
		a.sleep();
		a.fly();
	}

}
class Animal{
	public Animal() {
		
	}
	public void eat() {
		System.out.println("Animal is eating");
	}
	public void sleep() {
		System.out.println("Animal also sleeping");
	}
}
class Bird extends Animal{
	public void fly() {
		System.out.println("Bird will fly");
	}
}