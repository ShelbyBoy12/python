package Exception_Handling;
import java.util.*;

public class third {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the elements in the array");
		
		for(int i=0;i<n;i++)
		{
			String s = sc.next();
			try {
			arr[i] = Integer.parseInt(s);
			}catch(NumberFormatException e) {
				System.out.println(e);
				System.exit(0);
			}
		}
		
		System.out.println("Enter the index of the element you want to access");
		int x = sc.nextInt();
		
		try {
			int y = arr[x];
			System.out.println("The array element at index "+x+" = "+y+"\nThe array element successfully accessed");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
	}

}
