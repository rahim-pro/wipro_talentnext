public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
	}

}
class Shape{
	public Shape() {
		
	}
	public void draw() {
		System.out.println("Drawing shape");
	}
	public void erase() {
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape{
	
	@Override
	public void draw(){
		
		System.out.println("Drawing Circle");
	}
	@Override
	public void erase(){
		System.out.println("Erasing CIrcle");
	}
}
class Triangle extends Shape{
	@Override
	public void draw(){
		System.out.println("Drawing Triangle");
	}
	@Override
	public void erase(){
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape{
	@Override
	public void draw(){
		System.out.println("Drawing Square");
	}
	@Override
	public void erase(){
		System.out.println("Erasing Square");
	}
}