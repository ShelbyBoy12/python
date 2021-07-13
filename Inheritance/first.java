package Inheritance;

public class first {
	
	public static class Animal{
		void eat() {
			System.out.println("Eating in animal class");
		}
		void sleep() {
			System.out.println("Sleeping in animal class");
		}
	}
	
	public static class Bird extends Animal {
		void eat() {
			System.out.println("Eating in bird class");
		}
		void sleep() {
			System.out.println("Sleeping in bird class");
		}
		void fly() {
			System.out.println("Flying in bird class");
		}
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println("Invoking animal object : ");
		a.eat();
		a.sleep();
		Bird b = new Bird();
		System.out.println("\nInvoking bird object : ");
		b.eat();
		b.sleep();
		b.fly();
		
	}

}
