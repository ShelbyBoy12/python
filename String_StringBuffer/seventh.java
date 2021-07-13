package String_StringBuffer;
import java.util.*;

public class seventh {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		
		String str = sc.next();
		
		if(str.charAt(0) == 'x' || str.charAt(str.length()-1) == 'x') {
			for(int i=0;i<str.length();i++) 
				if(str.charAt(i) != 'x')
				System.out.print(str.charAt(i));
			
		}
		
		else {
			for(int i=0;i<str.length();i++) {
				System.out.print(str.charAt(i));
			}
		}
	}

}
