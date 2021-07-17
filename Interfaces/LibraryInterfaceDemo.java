package Interface;

public class LibraryInterfaceDemo {
	
	public static void main(String[] args) {
		KidUser k = new KidUser(10,"Kids");
		AdultUser a = new AdultUser(15,"Fiction");
		
		k.registerAccount();
		k.requestBook();
		
		a.registerAccount();
		a.requestBook();
	}

}
