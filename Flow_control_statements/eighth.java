package Flow_control_statements;
import java.util.*;

public class eighth {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the color code : ");
		String i = sc.next();
		
		switch(i) {
		case "R" : 
			System.out.println("Red");
			break;
		case "B" : 
			System.out.println("Blue");
			break;
		case "G" : 
			System.out.println("Green");
			break;
		case "O" : 
			System.out.println("Orange");
			break;
		case "Y" : 
			System.out.println("Yellow");
			break;
		case "W" : 
			System.out.println("White");
			break;
		default :
			System.out.println("Invalid Code");
		}
	}

}
