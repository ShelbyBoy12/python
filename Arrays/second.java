package Arrays;
import java.util.*;

public class second {
	public static void main(String[] args) {
		int[] arr = new int[]{ 1,234,2,55,3,4,5,6,7,8,-1,9,10 };
		
		Arrays.sort(arr);
		System.out.println("Minimum : "+arr[0]);
		System.out.println("Maximum : "+arr[arr.length-1]);
	}

}
