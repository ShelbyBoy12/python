package Encapsulation_Abstraction;

public class first {
	
	public static class Author{
		private String name;
		private String email;
		private char gender;
		
		Author(String n,String e, char g){
			name = n;
			email = e;
			gender = g;
		}
	}
	
	public static class Book{
		private String name;
		Author author;
		private double price;
		private int qtyInStock;
		
		Book(String n,Author a,double p,int q)
		{
			name = n;
			author = a;
			price = p;
			qtyInStock = q;
		}
		
		
		void getDetails() {
			System.out.println("Name of the book : "+name);
			System.out.println("Name of the author : "+author.name);
			System.out.println("Email of the author : "+author.email);
			System.out.println("Gender of the author : "+author.gender);
			System.out.println("Price of the book : "+price);
			System.out.println("Quantity of the book in stock : "+qtyInStock);
		}
		
		void setBookname(String b)
		{
			this.name = b;
			System.out.println("\nAfter updating the records : ");
			this.getDetails();
		}
		void setAuthorname(String a)
		{
			this.author.name = a;
			System.out.println("\nAfter updating the records : ");
			this.getDetails();
		}
		void setAuthoremail(String e)
		{
			this.author.email = e;
			System.out.println("\nAfter updating the records : ");
			this.getDetails();
		}
		
		void setAuthorgender(char g)
		{
			this.author.gender = g;
			System.out.println("\nAfter updating the records : ");
			this.getDetails();
		}
		
		void setBookprice(double d)
		{
			price = d;
			System.out.println("\nAfter updating the records : ");
			this.getDetails();
		}
		
		void setBookqty(int q)
		{
			qtyInStock = q;
			System.out.println("\nAfter updating the records : ");
			this.getDetails();
		}
		
	}
	
	public static void main(String[] args) {
		Author a = new Author("JK Rowling","abc@example.com",'F');
		Book b = new Book("Harry Potter",a,120,10);
		b.getDetails();
		
		b.setBookname("Harry Potter and the goblet of fire");
		b.setBookprice(200);
		b.setAuthoremail("ZYZ@example.com");
		
		
	}

}
