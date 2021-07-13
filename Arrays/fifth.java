package Arrays;
import java.util.*;

public class fifth {
	public static void main(String[] args) {
		int[] arr = new int[] {4,2,55,22,7,44,109,87,65,44,32,12};
		
		Arrays.sort(arr);
		
		System.out.println("Largest two numbers : "+arr[arr.length-1]+" "+arr[arr.length-2]);
		System.out.println("Smallest two numbers : "+arr[0]+" "+arr[1]);
	}

}
