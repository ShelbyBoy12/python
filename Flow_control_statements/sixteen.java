package Flow_control_statements;

public class sixteen {
	
	public static void main(String[] args) {
		
		if(args.length == 0)
			System.out.println("Please enter an integer number");
		
		int n = Integer.parseInt(args[0]);
		
		for(int i=0;i<n;i++)
		{
			for(int j = 0; j< n ;j++)
				if(i>=j)
					System.out.print("*	");
			System.out.println("\n");
		}
	}

}
