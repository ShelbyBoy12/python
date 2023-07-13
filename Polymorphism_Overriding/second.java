package Polymorphism_overriding;

public class second {
	
	public static class Shape{
		void draw() {
			System.out.println("Drawing Shape");
		}
		
		void erase() {
			System.out.println("Erasing Shape");
		}
	}
	
	public static class Circle extends Shape{
		void draw() {
			System.out.println("Drawing Circle");
		}
		
		void erase() {
			System.out.println("Erasing Circle\n");
		}
	}
	
	public static class Triangle extends Shape{
		void draw() {
			System.out.println("Drawing Triangle");
		}
		
		void erase() {
			System.out.println("Erasing Triangle\n");
		}
	}
	
	public static class Square extends Shape{
		void draw() {
			System.out.println("Drawing Square");
		}
		
		void erase() {
			System.out.println("Erasing Square");
		}
	}
	
	public static void main(String[] args) {
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
	}

}
