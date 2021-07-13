package String_StringBuffer;
import java.util.*;

public class eighth {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = sc.next();
		
		int index=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '*') {
				index = i;
			}
		}
		
		if(index == 0) {
			System.out.println("Enter a string having *");
		}
		else {
			for(int i=0;i<str.length();i++)
			{
				if(i != index && i != index-1 && i != index+1) {
					System.out.print(str.charAt(i));
				}
			}
		}
			
				
		 
	}

}
