public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple("medium");
		a.eat();
		Orange o=new Orange("small");
		o.eat();
	}

}
class Fruit{
	String name;
	String taste;
	String size;
	public Fruit(String name,String taste,String size) {
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	public void eat(){
		System.out.println("Fruit name is "+name+" taste was "+taste);
	}
}
class Apple extends Fruit{
	
	public Apple(String size) {
		super("Apple","sweet",size);
	}
	@Override
	public void eat() {
		
		System.out.println("Apple is very sweet and its size is "+size);
	}
}
class Orange extends Fruit{
	
	public Orange(String size) {
		super("Orange","bitter",size);
	}
	@Override
	public void eat() {
		System.out.println("Orange is very bitter in taste and its size is"+size);
	}
}