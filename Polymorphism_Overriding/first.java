package Polymorphism_overriding;

public class first {
	
	public static class Fruit{
		String name;
		String taste;
		int size;
		
		Fruit(String n,String t,int s){
			name = n;
			taste = t;
			size = s;
		}
		
		void eat() {
			System.out.println("Name of the fruit : "+name);
			System.out.println("Taste of the fruit : "+taste);
		}
	}
	
	public static class Apple extends Fruit{
		
		Apple(String n,String t,int s){
			super(n,t,s);
		}
		
		void eat() {
			System.out.println("Taste of the fruit : "+taste);
		}
	}
	
	public static class Orange extends Fruit{
		
		Orange(String n,String t,int s){
			super(n,t,s);
		}
		void eat() {
			System.out.println("Taste of the fruit : "+taste);
		}
	}
	
	public static void main(String[] args) {
		Apple a = new Apple("A","sweet",2);
		Orange o = new Orange("O","salty",3);
		a.eat();
		o.eat();
	}

}
