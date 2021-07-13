package String_StringBuffer;
import java.util.*;

public class nineth {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings");
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		int i=0,j=0;
		
		while(i<s1.length() && j<s2.length()) {
			System.out.print(s1.charAt(i));
			System.out.print(s2.charAt(j));
			i++;
			j++;
		}
		
		while(i<s1.length()) {
			System.out.print(s1.charAt(i));
			i++;
		}
		while(j<s2.length()) {
			System.out.print(s2.charAt(j));
			j++;
		}
		
	}

}
