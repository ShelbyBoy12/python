package Flow_control_statements;
import java.util.*;

public class fifteen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = sc.nextInt();
		int s=0;
		
		while(n>0)
		{
			int r = n%10;
			s += r;
			n /=10;
		}
		
		System.out.println(s);
	}

}
