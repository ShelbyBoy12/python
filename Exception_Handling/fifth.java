package Exception_Handling;

public class fifth {
	
	public static void division(int a,int b) throws ArithmeticException
	{
		int c = a/b;
		System.out.println("After division, the quotient is : "+c);
		
	}
	
	public static void main(String[] args) {
		
		try {
			division(1,0);
		}catch(ArithmeticException e) {
			System.out.println("Caught in main : "+e);
		}
		
	}

}
