package String_StringBuffer;
import java.util.*;

public class second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 strings");
		String s1 = sc.next().toLowerCase();
		String s2 = sc.next().toLowerCase();
		
		
		if(s1.charAt(s1.length()-1) == s2.charAt(0)) {
			for(int i=0;i<s1.length()-1;i++)
				System.out.print(s1.charAt(i));
			for(int i=0;i<s2.length();i++)
				System.out.print(s2.charAt(i));
		}
		
		else
		{
			for(int i=0;i<s1.length();i++)
				System.out.print(s1.charAt(i));
			System.out.print(" ");
			for(int i=0;i<s2.length();i++)
				System.out.print(s2.charAt(i));
			
		}
		
	}

}
