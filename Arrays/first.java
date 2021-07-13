package Arrays;

public class first {
	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4,5,6,7,8};
		int s = 0;
		float avg;
		
		for(int i=0;i<arr.length;i++)
		{
			s += arr[i];
		}
		avg = (float)s/arr.length;
		System.out.println("Sum : "+s+"\nAverage : "+avg);
	}

}
