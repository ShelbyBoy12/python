package Exception_Handling;
import java.util.*;

public class nineth {

	public static void main(String[] args) {
		
		System.out.println("Enter the 2 numbers");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int q = a/b;
			System.out.println("The quotient of "+a+"/"+b+" = "+q);
		}catch(ArithmeticException e) {
			System.out.println(e+" Caught");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
}
