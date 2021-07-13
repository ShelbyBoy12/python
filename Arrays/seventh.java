package Arrays;
import java.util.*;
public class seventh {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int[] new_array = new int[n];
		System.out.println("Enter the elements of the array ");
		for(int i=0;i<n;i++)
		{
			int x = sc.nextInt();
			arr[i] = x;
		}
		Arrays.sort(arr);
		
		int k=0;
		
		for(int i=0;i<n-1;i++)
		{
			if(arr[i] != arr[i+1])
				new_array[k++] = arr[i];
			
		}
		new_array[k++] = arr[n-1];
		
		System.out.println("The unique array is  ");
		for(int i = 0;i<k;i++)
			System.out.print(new_array[i] + " ");
		
		
	}

}
