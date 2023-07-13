package Exception_Handling;
import java.util.*;

public class first {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an Integer : ");
		String s = sc.next();
		
		try {
			int a = Integer.parseInt(s);
			System.out.println("The square value is "+a*a);
			System.out.println("The work has been done successfully");
		}catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
	}

}
