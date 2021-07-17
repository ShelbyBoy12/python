package Exception_Handling;
import java.util.*;

public class sixth {
	
	public static class MyException extends Exception{
		public MyException(String s) {
			super(s);
		}
		
	}

	
	public static void main(String[] args) {
		String n1,n2;
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		
		System.out.println("Enter the name and marks in 3 subjects of the students");
		
		Scanner sc = new Scanner(System.in);
		n1 = sc.next();
		for(int i=0;i<3;i++) {
			String x = sc.next();
			try {
				arr1[i] = Integer.parseInt(x);
				
				if(arr1[i] < 0)
					throw new MyException("Negative values");
				else if(arr1[i] > 100)
					throw new MyException("Greater than 100");
			}catch(MyException ex) {
				System.out.println(ex.getMessage());
				System.exit(0);
			}
			catch(NumberFormatException e) {
				System.out.println("Caught : "+e);
				System.exit(0);
			}
		}
		n2 = sc.next();
		for(int i=0;i<3;i++) {
			String x = sc.next();
			try {
				arr2[i] = Integer.parseInt(x);
				if(arr2[i] < 0)
					throw new MyException("Negative marks not allowed");
				else if(arr2[i] > 100)
					throw new MyException("Marks greater than 100 not allowed");
			}catch(MyException ex) {
				System.out.println(ex.getMessage());
				System.exit(0);
			}
			catch(NumberFormatException e) {
				System.out.println("Caught : "+e);
				System.exit(0);
			}
		}
		
		System.out.println("Average marks for "+n1);
		System.out.println((float)(arr1[0]+arr1[1]+arr1[2])/3);
		
		System.out.println("Average marks for "+n2);
		System.out.println((float)(arr2[0]+arr2[1]+arr2[2])/3);
		
		
	}
}
