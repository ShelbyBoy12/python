package Arrays;
import java.util.*;

public class third {
	public static void main(String[] args) {
		int[] arr = new int[] { 0,34,22,56,78,32,53,109 };
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be searched : ");
		int n = sc.nextInt();
		int flag = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(n == arr[i])
			{
				flag = 1;
				System.out.println(i);
			}
		}
		if(flag == 0)
			System.out.println("-1");
	}

}
