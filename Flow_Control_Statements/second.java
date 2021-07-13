package Flow_control_statements;
import java.util.*;

public class second {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		
		if( a%2 == 0) {
			System.out.println("Even");
		}
		else if( a%2 != 0) {
			System.out.println("Odd");
		}
		else 
			System.out.println("Number is not valid");
		
	}

}
