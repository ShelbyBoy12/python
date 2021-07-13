package String_StringBuffer;
import java.util.*;

public class third {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(0));
			System.out.print(s.charAt(1));
		}
	}

}
