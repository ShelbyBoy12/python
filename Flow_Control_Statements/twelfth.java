package Flow_control_statements;
import java.util.*;

public class twelfth {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int s = 0;
		
		for(int i=1;i<=n;i++)
			if( n%i == 0)
				s++;
		if(s==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
			
	}

}
