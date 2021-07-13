package String_StringBuffer;
import java.util.*;

public class fifth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		
		for(int i=1;i<str.length()-1;i++) {
			System.out.print(str.charAt(i));
		}
	}

}
