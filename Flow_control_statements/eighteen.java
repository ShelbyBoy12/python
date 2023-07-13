package Flow_control_statements;

public class eighteen {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		int temp = n;
		int s=0;
		int rev = 0;
		
		while(temp>0)
		{
			int r = temp%10;
			rev = rev*10 + r;
			temp /=10;
		}
		
		if(rev == n)
			System.out.println(n+" is a Palindrome");
		else
			System.out.println(n+" is not a Palindrome");
	}

}
