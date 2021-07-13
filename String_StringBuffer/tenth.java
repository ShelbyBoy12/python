package String_StringBuffer;
import java.util.*;

public class tenth {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string and an integer");
		String str = sc.next();
		int n = sc.nextInt();
		
		int index = str.length()-n;
		
		for(int i=0;i<n;i++)
			for(int j=index;j<str.length();j++)
				System.out.print(str.charAt(j));
	}

}
