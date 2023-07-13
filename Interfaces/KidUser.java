package Interface;

public class KidUser implements LibraryUser {
	
	int age;
	String bookType;
	
	KidUser(int a,String b){
		age = a;
		bookType = b;
	}
	
	public void registerAccount() {
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else if(age>=12) {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}
	
	public void requestBook() {
		if(bookType.equals("Kids")) {
			System.out.println("Book issued successfully, please return the book within 10 days");
		}
		else {
			System.out.println("Oops, you are not allowed to take kids books");
		}
		
		
	}

}
