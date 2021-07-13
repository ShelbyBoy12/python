package Flow_control_statements;

public class fourteen {
	public static void main(String[] args) {
		
		if(args.length == 0)
			System.out.println("Please enter an integer number");
		
		int n = Integer.parseInt(args[0]);
		
		if(n == 1 || n == 0)
			System.out.println(n+" is neither prime nor composite");
		else 
		{
		
			int s=0;
		
			for(int i=1;i<=n;i++)
				if(n%i==0)
					s++;
			if(s==2)
				System.out.println(n+" is a prime number");
			else
				System.out.println(n+ " is not a prime number");
		}
	}
}
