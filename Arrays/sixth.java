package Arrays;
import java.util.*;

public class sixth {
	public static void main(String[] args) {
		int[] arr = new int[] {3,8,1,4,3,2,1,4,-1,-9,0,77,100,-100};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		
	}

}
