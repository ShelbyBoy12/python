package Flow_control_statements;

public class fifth {
	
	public static void main(String[] args) {
		char a = '@';
		
		if(Character.isAlphabetic(a) == true) 
			System.out.println("Alphabet");
		
		else if(Character.isDigit(a) == true) 
			System.out.println("Digit");
		
		else
			System.out.println("Special Character");
	}

}
