package Flow_control_statements;

public class seventh {
	
	public static void main(String[] args) {
		
		char x = 'C';
		
		if(Character.isLowerCase(x)) 
			System.out.println(x+"->"+Character.toUpperCase(x));

		else if(Character.isUpperCase(x))
			System.out.println(x+"->"+Character.toLowerCase(x));
		
	}
}
