package String_StringBuffer;
import java.util.*;

public class first {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		
		StringBuffer buffer = new StringBuffer(s);
		buffer.reverse();
		String rev = buffer.toString();
		
		if(rev.equals(s)) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is not palindrome");
		}
	}

}
