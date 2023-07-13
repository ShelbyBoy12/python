package Arrays;
import java.util.*;

public class eighth {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the elements");
		
		for(int i = 0;i<n;i++)
		{
			int x = sc.nextInt();
			arr[i] = x;
		}
		
		int seven = 0; //To store index of the element
		int six = 0;  
		
		for(int i=0;i<n;i++)
		{
			if(arr[i] == 6)
				six = i;
			if(arr[i] == 7)
				seven = i;
		}
		
		int s = 0;
		
		for(int i=0;i<n;i++)
		{
			if(six > seven)
				s += arr[i];
			else if(i>=six && i<=seven)
				continue;
			else
				s += arr[i];
		}
		
		System.out.println("Sum is :" + s);
	}

}
