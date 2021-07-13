package String_StringBuffer;
import java.util.*;

public class sixth {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings : ");
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		if(s1.length()<s2.length()) {
			System.out.print(s1+s2+s1);
		}
		
		else if(s1.length()>s2.length()) {
			System.out.print(s2+s1+s2);
		}
		
		else {
			System.out.println("Strings cannot be of equal length");
		}
	}

}
