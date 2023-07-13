package String_StringBuffer;
import java.util.*;

public class fourth {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		
		if(str.length() % 2 == 0) {
			for(int i=0;i<str.length()/2;i++) {
				System.out.print(str.charAt(i));
			}
		}
		
		else {
			System.out.println("null");
		}
	}

}
